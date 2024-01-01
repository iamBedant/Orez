import org.jetbrains.compose.compose

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.jetbrainsCompose)
}

kotlin {
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }
    
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "arch"
            isStatic = true
        }
    }

    sourceSets {
        commonMain.dependencies {
            api(libs.mobiuskt.core)
            api(libs.mobiuskt.coroutines)
            api(libs.mobiuskt.test)
            api(libs.kotlinx.coroutines)
            implementation(libs.napier)
            api(compose.runtime)
            implementation(libs.androidx.annotation)
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }
}

android {
    namespace = "com.iambedant.arch"
    compileSdk = 34
    defaultConfig {
        minSdk = 24
    }
}
