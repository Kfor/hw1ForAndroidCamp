# hw1ForAndroidCamp
 3170105468-武靖超-安卓开发作业1
### 1.总体
在一个activity中实现了以下功能，
- 背景利用imageview放了图，上方放了头像和搜索框（点击放大镜还会提醒“没用”）；
- 中部有两个按钮、一段文字和进度条，随着按下两个按钮（随便哪个都可以），文字提醒“按了xx次”，同时进度条前进一格，当共计按了10次之后，提示“=、=你赢了”/“=、=太强了”（两个按钮不同的结果）；
- 底部text签名。
### 2.组件
1. ImageView：背景，头像
2. Button：两个按键
3. SearchView：没有用的搜索框
4. TextView：中间的变换文字，底部的签名
5. ProgressBar：显示按了几次的进度条
### 3.tips
1. 设置背景可以用imageview或者android:background，前者需要注意放置在底层，后者在想要调整透明度时候略麻烦（因为是父类）
2. 对齐：gravity
3. constraint保证间隔
4. 图片资源名称不能有大写（？？？）
5. java代码里，申请组件实例（并找到）要在方法里，然而申请通用的count要在成员变量里，否则会提示要final（然而会不可改）
6. 字符串放string
7. apk在build/outputs/debug下。事实上在建立git仓时，gitignore会自动忽略build文件夹，于是生成的apk就没有了=、=我强行将其删除后才留下来
