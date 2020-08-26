plugins {
    id("org.jetbrains.kotlin.js") version "1.4.0"
}

group = "com.liorgonnen"
version = "1.0-SNAPSHOT"

repositories {
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
    mavenCentral()
}

dependencies {
    api(project(":threejs_kt"))
    api(project(":statsjs_kt"))
}

kotlin {
    js {
        browser()
        binaries.executable()
    }
}