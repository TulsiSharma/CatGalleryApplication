plugins {
    id("com.android.application") version "8.1.4" apply false
    id("org.jetbrains.kotlin.android") version "1.7.20" apply false
    id ("com.google.dagger.hilt.android") version "2.41" apply false
    id ("com.android.library") version "7.4.0-alpha08" apply false
}
buildscript {

    dependencies {
        classpath ("com.google.dagger:hilt-android-gradle-plugin:2.42")
    }
}
