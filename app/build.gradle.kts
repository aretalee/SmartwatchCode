plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.myapplication"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.myapplication"
        minSdk = 30
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }

    packaging {
        resources {
            excludes += "META-INF/INDEX.LIST"
            excludes += "META-INF/io.netty.versions.properties"
            excludes += "META-INF/LICENSE.md"
            excludes += "META-INF/LICENSE-notice.md"
        }
    }

    buildFeatures {
        viewBinding = true
        dataBinding = true
    }
}

dependencies {

//    implementation(libs.play.services.wearable)
//    implementation(libs.appcompat)
//    implementation(libs.recyclerview)
//    implementation("com.github.Mikhaellopez:CircularProgressBar:3.1.0")
//    implementation(libs.runtime.android)
//    implementation(libs.compose.material)
//    implementation("com.google.code.gson:gson:2.10.1")
//    implementation("com.squareup.okhttp3:okhttp:4.11.0")
//    implementation("io.ktor:ktor-server-core-jvm:2.3.4")
//    implementation("io.ktor:ktor-server-cio-jvm:2.3.4")
//    implementation("io.ktor:ktor-server-content-negotiation-jvm:2.3.4")
//    implementation("io.ktor:ktor-serialization-kotlinx-json-jvm:2.3.4")
//    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.5.1")
//    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
//    implementation("androidx.cardview:cardview:1.0.0")

    // re-imported dependencies
    implementation(libs.play.services.wearable)
    implementation(platform(libs.compose.bom))
    implementation(libs.ui)
    implementation(libs.ui.tooling.preview)
    implementation(libs.compose.material)
    implementation(libs.compose.foundation)
    implementation(libs.wear.tooling.preview)
    implementation(libs.activity.compose)
    implementation(libs.core.splashscreen)
    implementation(libs.constraintlayout)
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.junit.jupiter)
    androidTestImplementation(platform(libs.compose.bom))
    androidTestImplementation(libs.ui.test.junit4)
    debugImplementation(libs.ui.tooling)
    debugImplementation(libs.ui.test.manifest)
    implementation(libs.circularprogressbar)
    implementation(libs.okhttp)
    implementation(libs.gson)
    testImplementation(libs.junit.jupiter.api.v540)
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.ktor.server.core)
    implementation(libs.ktor.server.netty)
    implementation(libs.ktor.server.content.negotiation)
    implementation(libs.ktor.serialization.kotlinx.json)
    implementation(libs.ktor.server.cio)



}