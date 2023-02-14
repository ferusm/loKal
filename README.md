# loKal

[![](https://jitpack.io/v/ferusm/lokal.svg)](https://jitpack.io/#ferusm/lokal)

This is compile-time localization tool for Kotlin

## Getting started

build.gradle.kts
```kotlin
plugins {
    kotlin("jvm") version "1.8.0"
    id("io.github.ferusm.lokal") version "0.2.0-SNAPSHOT"
}

repositories {
    mavenCentral()
    maven("https://jitpack.io") {
        name = "JitPack"
    }
}

loKal {
    sourceSet = kotlin.sourceSets["main"]
    register {
        input = projectDir.resolve("translations/specification.yaml")
        pack = "local.schema.test.generating"
        output = buildDir.resolve("generated/main/kotlin")
    }
}
```

settings.gradle.kts
```kotlin
rootProject.name = "example"

pluginManagement {
    repositories {
        mavenCentral()
        maven("https://jitpack.io") {
            name = "JitPack"
        }
    }
}
```

## Help
See example project