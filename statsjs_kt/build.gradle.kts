import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpackOutput.Target.ASSIGN

plugins {
    id("org.jetbrains.kotlin.js")
}

group = "com.liorgonnen"
version = "1.0-SNAPSHOT"

repositories {
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation(npm("stats-js", "1.0.1"))
}

kotlin {
    js {
        browser()
        binaries.executable()
    }
}