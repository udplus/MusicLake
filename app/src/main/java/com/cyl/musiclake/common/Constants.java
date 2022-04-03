package com.cyl.musiclake.common;

/**
 * Created by yonglong on 2016/5/8.
 */
public class Constants {
    //노래 운영 구별
    public static final int OP_LOCAL = 0; //아니 노래 다운로드, 삭제, 수정 (후속), 노래 목록에 추가
    public static final int OP_ONLINE = 1; //노래 삭제, 수정, 노래 목록에 추가
    public static final int OP_PLAYLIST = 2;// 수정 (후속), 노래 목록에 추가

    public static final String WEIBO = "weibo";
    //노래 유형
    public static final String LOCAL = "local";
    public static final String QQ = "qq";
    public static final String XIAMI = "xiami";
    public static final String BAIDU = "baidu";
    public static final String NETEASE = "netease";
    public static final String VIDEO = "video";//로컬 비디오
    public static final String YOUTUBE = "youtube";//YouTube

    //특별 노래 목록
    public static final String PLAYLIST_LOVE_ID = "love";
    public static final String PLAYLIST_HISTORY_ID = "history";
    public static final String PLAYLIST_LOCAL_ID = "local";
    public static final String PLAYLIST_QUEUE_ID = "queue";
    public static final String PLAYLIST_DOWNLOAD_ID = "download";

    //Baidu 노래 목록
    public static final String PLAYLIST_BD_ID = "playlist_bd";
    //Netease 클라우드 곡 목록
    public static final String PLAYLIST_WY_ID = "playlist_wy";
    public static final String PLAYLIST_WY_RECOMMEND_ID = "playlist_wy_recommend_songs";
    //QQ 노래 목록
    public static final String PLAYLIST_QQ_ID = "playlist_qq";
    //새우
    public static final String PLAYLIST_XIA_MI_ID = "playlist_xm";
    //온라인 송 목록
    public static final String PLAYLIST_CUSTOM_ID = "custom_online";
    //
    public static final String PLAYLIST_SEARCH_ID = "playlist_search";
    public static final String PLAYLIST_IMPORT_ID = "playlist_import";
    //Baidu 라디오 목록
    public static final String BAIDU_RADIO_LIST = "baidu_radio_list";
    public static final String NETEASE_ARITIST_LIST = "netease_artist_list";


    /**
     * 검색 필터
     */
    public static final String SP_KEY_SEARCH_FILTER_NETEASE = "sp_netease";
    public static final String SP_KEY_SEARCH_FILTER_QQ = "sp_netease";
    public static final String SP_KEY_SEARCH_FILTER_XIAMI = "sp_xiami";
    public static final String SP_KEY_SEARCH_FILTER_BAIDU = "sp_baidu";
    public static final String SP_KEY_SEARCH_FILTER_ = "sp_netease";
    public static final String SP_KEY_SONG_QUALITY = "song_quality";

    //노래 목록
    public static final int PLAYLIST_ADD = 0;
    public static final int PLAYLIST_DELETE = 1;
    public static final int PLAYLIST_UPDATE = 2;
    public static final int PLAYLIST_RENAME = 3;

    //QQ APP_ID
    public static final String APP_ID = "101454823";

    //커뮤니티 배경 작동 PHP.
    public static final String DEFAULT_URL = "http://119.29.27.116/hkmusic/operate.php";
    public static final String LOGIN_URL = "http://119.29.27.116/hkmusic/login.php";
    public static final String REGISTER_URL = "http://119.29.27.116/hkmusic/register.php";
    public static final String UPLOAD_URL = "http://119.29.27.116/hkmusic/upload_file.php";

    //사용자 사서함
    public static final String USER_EMAIL = "email";
    //사용자 로그인 암호
    public static final String PASSWORD = "password";
    public static final String TOKEN = "token";
    public static final String TOKEN_TIME = "token_time";
    public static final String LOGIN_STATUS = "login_status";
    //사용자 이름
    public static final String USERNAME = "username";
    //性别
    public static final String USER_SEX = "user_sex";
    //성별
    public static final String USER_IMG = "user_img";
    public static final String USER_COLLEGE = "user_college";
    public static final String USER_MAJOR = "user_major";
    public static final String USER_CLASS = "user_class";
    public static final String NICK = "nick";
    public static final String PHONE = "phone";
    public static final String SECRET = "secret";
    //창 화면 위치를 일시 중단합니다
    public static final String FLOAT_VIEW_X = "float_view_x";
    public static final String FLOAT_VIEW_Y = "float_view_y";


    //사용자 정보를 업데이트하십시오

    public static final String UPDATE_USER = "updateUserInfo";

    //사용자 ID.
    public static final String USER_ID = "user_id";
    //동적 ID
    public static final String SECRET_ID = "secret_id";
    //콘텐츠[동적 콘텐츠|코멘트]
    public static final String CONTENT = "content";

    //함수
    public static final String FUNC = "func";

    //노래를 흔들어 라
    public static final String SONG_ADD = "addSong";
    public static final String SONG = "song";

    //캐시인지 여부
    public static final String KEY_IS_CACHE = "is_cache";

    //노래 목록
    public static final String PLAYLIST_ID = "playlist";

    public static final String IS_URL_HEADER = "http";

    public static final String TEXT_PLAIN = "text/plain";

    /**
     * 일시 중단 된 창 EPA Requestcode.
     */
    public static final int REQUEST_CODE_FLOAT_WINDOW = 0x123;
    public static final int REQUEST_CODE_LOGIN = 10001;

    //在线音乐
    public static final String FILENAME_MP3 = ".mp3";
    public static final String FILENAME_LRC = ".lrc";
    public static final int MUSIC_LIST_SIZE = 10;

    public static final String BASE_MUSIC_URL = "http://tingapi.ting.baidu.com/v1/restserver/ting?" +
            "from=android&version=5.8.2.0&channel=huwei&operator=1&method=baidu.ting.billboard.billCategory&format=json&kflag=2";

    public static final String DEAULT_NOTIFICATION = "notification";
    public static final String TRANSTITION_ALBUM = "transition_album_art";

    /**
     * QQ音乐Api*************************************************
     */
    public static final String BASE_URL_QQ_MUSIC_URL = "https://u.y.qq.com";

    /**
     * 새우 음악 API.*************************************************
     */
    public static final String BASE_XIAMI_URL = "http://api.xiami.com/";
    /**
     * 멋진 개 음악 API.*************************************************
     */
    public static final String BASE_KUGOU_URL = "http://lyrics.kugou.com/";
    /**
     * Baidu 음악 API.*************************************************
     */
    public static final String BASE_URL_BAIDU_MUSIC = "http://musicapi.qianqian.com/";

    public static final String URL_GET_SONG_INFO = "http://music.baidu.com/data/music/links?songIds=";

    /**
     * 온라인 송 목록 인터페이스 API.*************************************************
     */
    public static final String BASE_PLAYER_URL = "https://player.zzsun.cc/";
    /**
     * Netease 클라우드 음악 인터페이스
     */
    public static final String BASE_NETEASE_URL = "http://musiclake.leanapp.cn";
    /**
     * Bugly app_id
     */
    public static final String BUG_APP_ID = "fd892b37ea";

    /**
     * github 주소 정보
     */
    public static final String ABOUT_MUSIC_LAKE = "https://github.com/caiyonglong/MusicLake";
    public static final String ABOUT_MUSIC_LAKE_ISSUES = "https://github.com/caiyonglong/MusicLake/issues/new";
    public static final String ABOUT_MUSIC_LAKE_PC = "https://github.com/sunzongzheng/music/releases";
    public static final String ABOUT_MUSIC_LAKE_URL = "https://github.com/caiyonglong/MusicLake/blob/develop/README.md";


    /**
    * app_key, 현재 데모 응용 프로그램, 타사 응용 프로그램은이 app_key를 자신의 app_key로 바꾸어야합니다     */
    public static final String APP_KEY = "3338754271";

    /**
     * 현재 데모의 콜백 페이지, 타사 응용 프로그램은 자체 콜백 페이지를 사용할 수 있습니다.
     * 기본 콜백 페이지를 사용하는 것이 좋습니다. https://api.weibo.com/oauth2/default.html
     */
    public static final String REDIRECT_URL = "https://api.weibo.com/oauth2/default.html";

    /**
     * WeiboSDKDemo 응용 프로그램 서신, 제 3 자 개발자는 일반적으로 그렇게 필요하지 않습니다. 비어 있도록 설정할 수 있습니다.
     *자세한 내용은 데모에 해당하는 메모를 확인하십시오.
     */
    public static final String SCOPE = "";

    //    public static final String SOCKET_URL = "http://39.108.214.63:15003";
    public static final String SOCKET_URL = "https://socket.zzsun.cc";
    public static final String OAUTH_GITHUB = "oauth_github";
    public static final String OAUTH_QQ = "oauth_qq";
    public static final String OAUTH_WEIBO = "oauth_weibo";
    public static final String GITHUB_BASE_URL = "https://github.com";
    public static final String GITHUB_REDIRECT_URI = "musiclake://oauth";
    public static final String GITHUB_CLIENT_ID = "05baa9742e6a72d662a6";
    public static final String GITHUB_CLIENT_SECRET = "776c29a9eb0822505829483a1dfcd19812ac622f";
    public static final String GOOGLE_DEVELOPER_KEY = "AIzaSyCVdXoMhAPa1UdAyxKUK5Xp-uxWG612OEg";
}
