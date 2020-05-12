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
}

kotlin {
    target {
        browser { }
        produceExecutable()
    }
}