plugins {
    id("org.jetbrains.kotlin.js")
}

group = "com.liorgonnen"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(npm("three", "^0.120.0", generateExternals = false))
}

kotlin {
    js {
        browser()
        binaries.executable()
    }
}