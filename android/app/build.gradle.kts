plugins {
    id("com.android.application")
    id("kotlin-android")
    id("com.google.gms.google-services") // if you're using Firebase
    id("dev.flutter.flutter-gradle-plugin") // Flutter plugin
}

android {
    namespace = "com.ai.fashiondesigner"
    compileSdk = flutter.compileSdkVersion
    ndkVersion = "27.0.12077973" 

    defaultConfig {
        applicationId = "com.suriya.aifashiondesigner"
        minSdk = flutter.minSdkVersion
        targetSdk = flutter.targetSdkVersion
        versionCode = flutter.versionCode
        versionName = flutter.versionName
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
    release {
        isMinifyEnabled = true  // Enable code shrinking
        isShrinkResources = true // This removes unused resources safely
        proguardFiles(
            getDefaultProguardFile("proguard-android-optimize.txt"),
            "proguard-rules.pro"
        )
        signingConfig = signingConfigs.getByName("debug") // or your release signing config
    }
}

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
}

flutter {
    source = "../.."
}
