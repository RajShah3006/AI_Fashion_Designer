plugins {
    id("com.android.application")
    id("kotlin-android")
    // ... other plugins
}

android {
    namespace = "com.ai.fashiondesigner" 
    compileSdk = 34 // Your compile SDK version
    ndkVersion = "27.0.12077973"

    defaultConfig {
        applicationId = "com.suriya.aifashiondesigner" // Your actual application ID
        minSdk = 21 // Your minimum SDK version
        targetSdk = 34 // Your target SDK version
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
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
}

dependencies {
    // ... your project dependencies
}
