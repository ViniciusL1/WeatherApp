plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    id("kotlin-kapt")
    id("kotlin-parcelize")

}

android {
    namespace = "com.example.weatherapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.weatherapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures{
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.activityktx)

    // Retrofit
    implementation(libs.retrofit)
    implementation(libs.retrofitcoverter)

    //okhttp
    implementation(libs.okhttp)
    implementation(libs.okhttpinter)

    //life
    implementation(libs.lifecycleexte)
    implementation(libs.lifecyclerun)
    implementation(libs.lifecycleview)
    implementation(libs.lifecyclelive)

    //gson
    implementation(libs.gson)

    //github

    implementation("com.github.MatteoBattilana:WeatherView:3.0.0")
    implementation("com.github.Dimezis:BlurView:version-2.0.3")
    implementation("com.github.bumptech.glide:glide:4.12.0")

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}
kapt{
    correctErrorTypes = true
}