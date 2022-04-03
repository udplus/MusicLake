# MusicLake
![Workflow result](https://github.com/caiyonglong/MusicLake/workflows/Check/badge.svg)

[MediaPlayer、ExoPlayer音乐库封装](https://github.com/caiyonglong/MusicLake/tree/dev_musiclib)

# Netease Music 및 QQ Music의 공식 경고 편지로 인해 API 서비스를 폐쇄했습니다.,더 이상 모든 APK를 제공하지 않습니다.

# 컴파일 및 서버 배포
 [build.md](BUILD.md)

# 기능 버전
- Android 뮤직 플레이어 (로컬 / 온라인 플레이) (최소 지원 안드로이드 버전 5.0)
- 다중 플랫폼 음악 소스, Baidu 음악, 새우 음악, Netease 클라우드 음악, YouTube (벽을 뒤집어야 함)
- 가사 재생, 데스크탑 가사, 바탕 화면 소규모 컨트롤
- 알림 바 제어, 와이어 제어 재생, 오디오 포커스 제어
    QQ 로그인, Weibo Landing, 온라인 송 목록 동기화
- Netease Cloud 인기있는 가수, Baidu 라디오 목록, 네스 클라우드 MV 목록, MV 플레이 코멘트
- 멋진 개가사 검색, 수정 서정 스타일, 가사 번역
- [PC끝](https://github.com/sunzongzheng/music)

### 오픈 소스는 쉽지 않고, 관심이 쉽고, 별을 제공 할 수 있습니다!
- 그룹 채팅이 해산되었으며, 언급 될 수있는 문제가 무엇입니까?[issues](https://github.com/caiyonglong/MusicLake/issues)
    ...에!나는 홍보가 언급 될 수 있다는 생각이있다.주의를 기울이 줘서 고마워

![함수](screenshots/features.png)

# 계획
- [ ] 문서 정렬
    - [MusicAPI 액세스 및 디버그 문서](./doc/音乐接口组件库接入.md)
- [ ] 리팩토링

# 관련 프로젝트|음악 API.
- [클라이언트 음악 API.](https://github.com/caiyonglong/MusicApi)
- [고객/PC 음악 공유 API.](https://github.com/sunzongzheng/musicApi)
- [무대 뒤에서/yunge 싱글 API.](https://github.com/sunzongzheng/player-be)
- [삼자/NeteaseCloudMusicApi](https://github.com/Binaryify/NeteaseCloudMusicApi)

# 제 3 자 라이브러리

- [rxjava](https://github.com/ReactiveX/RxJava)
- [retrofit](https://github.com/square/retrofit)
- [dagger2](https://github.com/google/dagger)
- [Glide](https://github.com/bumptech/glide)
- [LitePal](https://github.com/LitePalFramework/LitePal)
- [DSBridge](https://github.com/wendux/DSBridge-Android)
- [BaseRecyclerViewAdapterHelper](https://github.com/CymChad/BaseRecyclerViewAdapterHelper)
- [More..](https://github.com/caiyonglong/MusicLake/blob/develop/app/build.gradle)

# 소프트웨어 실행 스크린 샷



    github 제한이 있으므로 모든 그림이 뒤집어 져야합니다. 로컬 미리보기에 복제하십시오



<p>
<img src="screenshots/preview1.png" width="225" height="400"/>
<img src="screenshots/preview2.png" width="225" height="400"/>
<img src="screenshots/preview3.png" width="225" height="400"/>
<img src="screenshots/preview4.png" width="225" height="400"/>
<img src="screenshots/preview5.png" width="225" height="400"/>
<img src="screenshots/preview6.png" width="225" height="400"/>
<img src="screenshots/preview7.png" width="225" height="400"/>
<img src="screenshots/preview8.png" width="225" height="400"/>
<img src="screenshots/preview9.png" width="225" height="400"/>
<img src="screenshots/preview10.png" width="225" height="400"/>
<img src="screenshots/preview11.png" width="225" height="400"/>
<img src="screenshots/preview12.png" width="225" height="400"/>
<img src="screenshots/preview13.png" width="225" height="400"/>
</p>

- 夜间模式相关截图

<p>
<img src="screenshots/dark_preview1.png" width="225" height="400"/>
<img src="screenshots/dark_preview2.png" width="225" height="400"/>
<img src="screenshots/dark_preview3.png" width="225" height="400"/>
<img src="screenshots/dark_preview4.png" width="225" height="400"/>
<img src="screenshots/dark_preview5.png" width="225" height="400"/>
</p>



# 면책 조항
- 음악 호수는 법적 분쟁을 창출하는 것과 같은 상업 및 불법적 인 목적을 금지하고, 할 일이없는 개인 학습 연구로만 사용됩니다.
- 음악 API는 GitHub, 비 공식 API에서 제공됩니다.이 소프트웨어는 오디오 저장소 서비스를 제공하지 않습니다. 오디오를 다운로드 해야하는 경우 정품을 지원하십시오!...에
- 음악 저작권은 모든 사이트에 속하며이 사이트는 법적 책임과 공동 책임을 맡지 않습니다.이미 귀하의 저작권이 참여한 경우이 관리자에게 문의하여 처음으로 처리하십시오.
- MusicLake는 균열 소프트웨어가 아니며 유료 노래를 다운로드하지 않습니다!
# 저작권주의 사항"QQ", "QQ 음악"과 펭귄 이미지의 이미지, 그래픽 및 비즈니스 로고의 이미지, 저작권 또는 상표권이 Tencent에 속합니다.
QQ 음악은 플랫폼의 라이센스의 저작권을 누리고 저작권 콘텐츠를 복사하지 마십시오.자세한 내용은 QQ 음악 사용자 계약을 참조하십시오.

"새우", "새우 음악"및 기타 텍스트, 그래픽 및 상업 로고, 그들의 저작권 또는 상표권은 알리 회사에 속합니다.
새우 음악 음악이 라이센스가 부여 된 저작권을 누리고 저작권 콘텐츠를 복사하지 마십시오.자세한 내용은 새우 음악 사용자 계약을 참조하십시오.

텍스트, 그래픽 및 비즈니스 로고는 "Netease Cloud", "Netease Cloud Music", 저작권 또는 상표권이 그물에 속합니다.
Netease 클라우드 음악은 해당 플랫폼에서 라이센스가 부여 된 음악 저작권을 누리고 저작권 내용을 복사하지 마십시오.자세한 내용은 Netease Cloud Music 사용자 계약을 참조하십시오.
## :moneybag: 지원하다&捐赠
오픈 소스는 쉽지 않습니다. ^ v ^ : moneybag를 보상하십시오 :
- 서버의 일일 비용에 사용됩니다
- 일부를 추가하십시오
- WeChat :
<img src="screenshots/donate_wechat.png" width="225" height="225"/>

- Alipay.:
<img src="screenshots/donate_alipay.png" width="225" height="225"/>
