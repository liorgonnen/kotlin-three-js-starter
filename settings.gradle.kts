pluginManagement {
    repositories {
        mavenCentral()
        maven("https://plugins.gradle.org/m2/")
    }
}
rootProject.name = "kotlin-three-js-starter"

include("threejs_kt")
include("statsjs_kt")

