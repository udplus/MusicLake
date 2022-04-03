package com.cyl.musiclake.api.youtube

import com.cyl.musiclake.bean.Music
import com.cyl.musiclake.common.Constants
import com.google.api.client.http.HttpRequestInitializer
import com.google.api.client.http.javanet.NetHttpTransport
import com.google.api.client.json.JsonFactory
import com.google.api.client.json.jackson2.JacksonFactory
import com.google.api.services.youtube.YouTube
import com.google.api.services.youtube.model.SearchListResponse
import com.google.api.services.youtube.model.VideoListResponse
import java.io.IOException

object YoutubeDataApi {
    private val limit: Long = 25
    /**
     * HTTP 전송의 전역 인스턴스를 정의하십시오.
     */
    private val HTTP_TRANSPORT = NetHttpTransport()

    /**
     * JSON 공장의 글로벌 인스턴스를 정의하십시오.
     */
    val JSON_FACTORY: JsonFactory = JacksonFactory()
    /**
     * 사용되는 YouTube 객체의 전역 인스턴스를 정의합니다.
     * YouTube 데이터 API 요청을하십시오.
     */
    private var youtube: YouTube? = null

    /**
     * YouTube 개체를 초기화하고 YouTube에서 비디오를 검색하십시오.그 다음에
     * 각 비디오의 이름과 축소판이 결과 집합에 표시됩니다.
     */
    fun search(queryTerm: String, pageToken: String, hasCaption: Boolean = false): SearchListResponse? {
        try {
            // YouTube 데이터 API 요청 객체 가져 오기
            youtube = YouTube.Builder(HTTP_TRANSPORT, JSON_FACTORY, HttpRequestInitializer { }).setApplicationName("com.aoe.music.MusicApp").build()
            // Define the API request for retrieving search results.
            val search = youtube!!.search().list("id,snippet")
            // Set your developer key from the {{ Google Cloud Console }} for
            // non-authenticated requests. See:
            // {{ https://cloud.google.com/console }}
            search.key = Constants.GOOGLE_DEVELOPER_KEY
            search.q = queryTerm
            search.pageToken = pageToken
            // Restrict the search results to only include videos. See:
            // https://developers.google.com/youtube/v3/docs/search/list#type
            search.type = "video"
            if (!hasCaption) {
                search.videoCaption = "any"
            } else {
                search.videoCaption = "closedCaption"
            }
            // To increase efficiency, only retrieve the fields that the
            // application uses.
            search.fields = "nextPageToken,items(id,snippet)"
            search.maxResults = limit
            // Call the API and print results.
            return search.execute()
        } catch (e: IOException) {
            System.err.println("There was an IO error: " + e.cause + " : " + e.message)
        } catch (t: Throwable) {
            t.printStackTrace()
        }
        return null
    }

    private fun getSongInfo(ids: String): VideoListResponse? {
        try {
            // YouTube 데이터 API 요청 객체 가져 오기
            youtube = YouTube.Builder(HTTP_TRANSPORT, JSON_FACTORY, HttpRequestInitializer { }).setApplicationName("com.aoe.music.MusicApp").build()
            // Define the API request for retrieving search results.
            val search = youtube!!.videos().list("id,snippet")
            // Set your developer key from the {{ Google Cloud Console }} for
            // non-authenticated requests. See:
            // {{ https://cloud.google.com/console }}
            search.key = Constants.GOOGLE_DEVELOPER_KEY
            search.id = ids
            // Restrict the search results to only include videos. See:
            // https://developers.google.com/youtube/v3/docs/search/list#type
            // To increase efficiency, only retrieve the fields that the
            // application uses.
            search.fields = "items(id,snippet)"
            search.maxResults = limit
            // Call the API and print results.
            return search.execute()
        } catch (e: IOException) {
            System.err.println("There was an IO error: " + e.cause + " : " + e.message)
        } catch (t: Throwable) {
            t.printStackTrace()
        }
        return null
    }

    /**
     * ID. YouTube 노래 정보를 얻으십시오
     */
    fun getYoutubeSongInfo(ids: List<String>, result: (resultList: MutableList<Music>) -> Unit) {

        val count = if (ids.size % 50 == 0) {
            ids.size / 50
        } else {
            (ids.size / 50) + 1
        }
        val songlist = mutableListOf<Music>()
        val map = mutableMapOf<Int, List<String>>()
        repeat(count) {
            if (it == count - 1) {
                map[it] = ids.subList(it * 50, ids.size)
            } else {
                map[it] = ids.subList(it * 50, (it + 1) * 50)
            }
        }
        for ((_, idList) in map) {
            val id = idList.toString().replace("[", "").replace("]", "")
            val list = getSongInfo(id)
            list?.let {
                list.items.mapTo(songlist) {
                    val song = Music()
                    song.title = it.snippet.title
                    song.artist = it.snippet.channelTitle
                    song.artistId = it.snippet.channelId
                    song.mid = it.id
                    song.coverUri = it.snippet.thumbnails.high.url
                    song.type = Constants.YOUTUBE
                    song
                }
            }
        }
        result.invoke(songlist)
    }

    /**
     * 노래 목록을 얻으십시오
     * 지나가 다 snippet.type (upload/subscription/like)
     * 그가 업로드 한 비디오를 가져옵니다 (일부 획득, 저작권 문제 추측)
     * 가입 채널을 가져 오십시오 (이제 업로드 한 비디오 수를 얻을 때이 데이터를 얻을 수 있습니다)
     * 유사한 권장 사항을 얻으십시오 (이 데이터는 0 인 비디오 수가 0 일 때 얻을 수 있습니다)
     */
    fun getUpListBySinger(singerId: String, pageToken: String?,
                          resultList: (String?, MutableList<Music>) -> Unit) {
        try {
            // 获取YouTube数据API请求对象
            val youtube = YouTube.Builder(NetHttpTransport(), JSON_FACTORY, HttpRequestInitializer { })
                    .setApplicationName("com.aoe.music.MusicApp").build()
            val list = youtube.Activities().list("snippet,contentDetails")
            list.channelId = singerId
            list.pageToken = pageToken
            list.maxResults = 10
            list.key = Constants.GOOGLE_DEVELOPER_KEY
            val result = list.execute()
            val songList = mutableListOf<Music>()
            result.items?.forEach {
                it.contentDetails?.let { detail ->
                    val id: String? = when {
                        detail.upload?.videoId != null -> {
                            detail.upload?.videoId
                        }
                        detail.like?.resourceId?.videoId != null -> {
                            detail.like?.resourceId?.videoId
                        }
                        else -> {
                            null
                        }
                    }
                    val snippet = it.snippet
                    id?.let {
                        val song = Music()
                        song.title = snippet.title
                        song.artist = snippet.channelTitle
                        song.artistId = snippet.channelId
                        song.mid = it
                        song.coverUri = snippet.thumbnails?.standard?.url
                                ?: snippet.thumbnails?.high?.url
                                        ?: snippet.thumbnails?.default?.url
                                        ?: snippet.thumbnails?.standard?.url
                        song.type = Constants.YOUTUBE
                        songList.add(song)
                        println(song)
                    }
                }
            }
            resultList.invoke(result.nextPageToken, songList)
        } catch (t: Throwable) {
            t.printStackTrace()
            resultList.invoke(null, mutableListOf())
        }
    }
}