plugins {
    alias(libs.plugins.kotlin.kapt)
    alias(libs.plugins.myproject.android.feature)
}

android {

    namespace = "com.yandex.practicum.middle_homework_5.news"
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

    implementation(libs.androidx.paging.compose)
    implementation(libs.goodle.gson)
    implementation(libs.androidx.room.runtime)
    implementation(libs.androidx.room.ktx)
    implementation(libs.androidx.room.paging)
    kapt(libs.room.kapt)
    implementation(libs.squareup.retrofit2)
    implementation(libs.koin.compose)
    implementation(libs.androidx.work.manager.ktx)

    implementation(project(":settings"))
}