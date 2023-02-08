plugins {
    kotlin("jvm") version "1.8.0" apply false
}

allprojects {
    group = "org.github.ferusm.lokal"
    version = "0.1.0-SNAPSHOT"

    repositories {
        mavenCentral()
    }
}

dependencies {
    implementation(project(":plugin"))
}