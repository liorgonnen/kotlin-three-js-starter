plugins {
    id("org.jetbrains.kotlin.js") version "1.4-M1"
}

group = "com.liorgonnen"
version = "1.0-SNAPSHOT"

repositories {
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-js"))
    api(project(":threejs_kt"))
}

kotlin {
    target {
        browser()
        produceExecutable()
    }
}