#libGDX with Android Studio

## Setup

- Download [libGDX latest](http://libgdx.badlogicgames.com/download.html)
- Copy *gdx.jar* file , *armeabi* folder and *armeabi-v7a* folder to lib directory
- Copy *armeabi.jar*, *armeabi-v7a.jar* and *gdx-backend-andrdoi.jar* to libs directory
- Archive the *armeabi* and *armeabi-v7a* folders with parent directory to zip files  and rename extension from zip to jar.

>  armeabi.jar => "/lib/armeabi/libgdx.so"

>  armeabi-v7a => "/lib/armeabi-v7a/libgdx.so"

- Move these jar files to libs directory

> Linux 64 Bit must copy *x86* folder to lib directory, archive => rename file from zip to jar and put *x86.jar* to libs directory

## Project Structure

```
.
├── /.idea
├── /app
|   └── /build
|   └── /lib
|       ├── /armeabi
|           └── /libgdx.so
|       ├── /armeabi-v7a
|           └── /libgdx.so
|       ├── /x86
|           └── /libgdx.so
|       ├── gdx.jar
|   ├── /libs
|       ├── armeabi.jar
|       ├── armeabi-v7a.jar
|       ├── gdx-backend-android.jar
|       ├── x86.jar
|   ├── /src
├── app.iml
├── build.gradle
└── ...
```

## Gradle Setup

```
dependencies {
    compile 'com.android.support:appcompat-v7:+'

    compile files('lib/gdx.jar')

    compile files('libs/gdx-backend-android.jar')

    compile files('libs/x86.jar');

    compile fileTree(dir: 'libs', include: ['*.jar', '*.aar'])
}
```




## References :

- [libgdx Tutorial: Introduction](http://steigert.blogspot.com/2012/02/1-libgdx-tutorial-introduction.html)
- [ANDROID STUDIO – INTEGRATION WITH GAME LIBRARIES](http://bgnstudio.wordpress.com/2013/11/04/android-studio-integration-with-game-libraries-part-ii/)


