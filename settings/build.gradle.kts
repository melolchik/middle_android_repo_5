plugins {
    alias(libs.plugins.myproject.android.feature)
}

android {

    namespace = "com.yandex.practicum.middle_homework_5.settings"

    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.data.store)
    implementation(libs.koin.compose)

}