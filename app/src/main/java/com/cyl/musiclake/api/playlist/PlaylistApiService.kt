package com.cyl.musiclake.api.playlist


import com.cyl.musicapi.playlist.CollectResult
import com.cyl.musicapi.playlist.MusicInfo
import com.cyl.musicapi.playlist.PlaylistInfo
import com.cyl.musicapi.playlist.UserInfo
import com.cyl.musiclake.bean.MessageInfoBean
import com.cyl.musiclake.bean.NoticeInfo
import io.reactivex.Observable
import okhttp3.ResponseBody
import retrofit2.http.*

/**
 * Created by master on 2018/4/5.
 * des :자기 게시 곡 단일 인터페이스
 *
 */

interface PlaylistApiService {

    /**
     * 음악 인터페이스 API의 최신 인터페이스를 가져옵니다
     * @param url 요청 링크
     * @return
     */
    @GET
    fun checkMusicApiJs(@Url url: String): Observable<String>

    /**
     * 음악 인터페이스 API에서 최신 통지를 받으십시오
     * @param url 요청 링크 https://music-lake-android.zzsun.cc/notice.json
     * @return
     */
    @GET
    fun checkMusicLakeNotice(@Url url: String): Observable<NoticeInfo>

    /**
     * 채팅 정보 가져 오기
     * @param start_dt 开始时间 2018-09-29默认为 2018-09-29 00:00:00
     * @param end_dt 结束时间 '2018-09-29 23:59:59'
     * @return
     */
    @GET("chat-history")
    fun getChatHistory(@Header("accesstoken") token: String?, @Query("start_dt") start: String?, @Query("end_dt") end: String?): Observable<MutableList<MessageInfoBean>>

    /**
     * 노래 목록을 얻으십시오
     *
     * @param token 비밀
     * @return
     */
    @GET("playlist")
    fun getOnlinePlaylist(@Header("accesstoken") token: String?): Observable<ResponseBody>

    /**
     * 노래 목록을 얻으십시오
     *
     * @param token 비밀
     * @param id    노래 목록 ID.
     * @return
     */
    @GET("playlist/{id}")
    fun getMusicList(@Header("accesstoken") token: String?, @Path("id") id: String): Observable<ResponseBody>

    /**
     * 노래 목록 삭제
     *
     * @param token 비밀
     * @param id    노래 목록 ID.
     * @return
     */
    @DELETE("playlist")
    fun deleteMusic(@Header("accesstoken") token: String?, @Query("id") id: String): Observable<ResponseBody>


    /**
     * 노래 목록의 이름을 바꿉니다
     *
     * @param token    비밀
     * @param id       노래 목록 ID.
     * @param playlist 歌单信息
     * @return
     */
    @PUT("playlist/{id}")
    @Headers("Content-Type: application/json")
    fun renameMusic(@Header("accesstoken") token: String?, @Path("id") id: String, @Body playlist: PlaylistInfo): Observable<ResponseBody>

    /**
     * 새로운 노래 목록
     *
     * @param token
     * @return
     */
    @POST("playlist")
    @Headers("Content-Type: application/json")
    fun createPlaylist(@Header("accesstoken") token: String?, @Body playlist: PlaylistInfo): Observable<ResponseBody>

    /**
     * 컬렉션 곡
     *
     * @param token
     * @param id        노래 목록 ID.
     * @param musicInfo 歌曲信息
     * @return
     */
    @POST("playlist/{id}")
    @Headers("Content-Type: application/json")
    fun collectMusic(@Header("accesstoken") token: String?, @Path("id") id: String, @Body musicInfo: MusicInfo): Observable<ResponseBody>

    /**
     *  배치 컬렉션 노래 (동일 음악 소스)
     *
     * @param token
     * @param ids        노래 목록 ID.s
     * @param musicInfo 歌曲信息
     * @return
     */
    @POST("playlist/{id}/batch")
    @Headers("Content-Type: application/json")
    fun collectBatchMusic(@Header("accesstoken") token: String?, @Path("id") id: String, @Body data: Any): Observable<CollectResult>

    /**
     * 배치 컬렉션 노래 (다른 음악 소스)
     *
     * @param token
     * @param ids        노래 목록 ID.s
     * @param musicInfo 歌曲信息
     * @return
     */
    @POST("playlist/{id}/batch2")
    @Headers("Content-Type: application/json")
    fun collectBatch2Music(@Header("accesstoken") token: String?, @Path("id") id: String, @Body data: Any): Observable<CollectResult>

    /**
     * 取消收藏歌曲
     *
     * @param token 비밀
     * @return
     */
    @DELETE("playlist/{id}")
    fun disCollectMusic(@Header("accesstoken") token: String?, @Path("id") id: String, @Query("id") songid: String): Observable<ResponseBody>

    /**
     * 获取用户信息
     *
     * @param token
     * @param openid
     * @return
     */
    @GET("auth/qq/android")
    fun loginByQQ(@Query("access_token") token: String?,
                  @Query("openid") openid: String): Observable<UserInfo>


    /**
     * 微博登录获取用户信息
     *
     * @param token
     * @param openid
     * @return
     */
    @GET("auth/weibo/android")
    fun loginByWeiBo(@Query("access_token") token: String?,
                     @Query("uid") openid: String): Observable<UserInfo>

    /**
     * Github登录获取用户信息
     *
     * @param token
     * @param openid
     * @return
     */
    @GET("auth/github/android")
    fun loginByGithub(@Query("access_token") token: String): Observable<UserInfo>

    /**
     * 验证用户登录状态是否过期
     *
     * @param token
     * @return
     */
    @GET("user")
    fun checkLoginStatus(@Header("accesstoken") token: String?): Observable<UserInfo>

    /**
     * 获取网易云排行榜
     *
     * @param token
     * @param openid
     * @return
     */
    @GET("music/netease/rank")
    fun getNeteaseRank(@Query("ids[]") ids: IntArray, @Query("limit") limit: Int? = null): Observable<MutableList<PlaylistInfo>>

    /**
     * 获取网易云排行榜
     *
     * @param token
     * @param openid
     * @return
     */
    @GET("music/qq/rank")
    fun getQQRank(@Query("limit") limit: Int? = null, @Query("ids[]") ids: IntArray? = null): Observable<MutableList<PlaylistInfo>>


}
