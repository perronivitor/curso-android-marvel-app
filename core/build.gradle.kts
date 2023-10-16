plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
    // OkHttp
    val okHttpVersion = "4.9.0"
    api(platform("com.squareup.okhttp3:okhttp-bom:$okHttpVersion"))
    api("com.squareup.okhttp3:okhttp")
    api("com.squareup.okhttp3:logging-interceptor")

    // Retrofit
    val retrofitVersion = "2.9.0"
    api("com.squareup.retrofit2:retrofit:$retrofitVersion")
    api("com.squareup.retrofit2:converter-gson:$retrofitVersion")

    //Gson
    val gsonVersion = "2.9.0"
    api("com.google.code.gson:gson:$gsonVersion")

    //Paging3 Common
    val pagingVersion = "3.1.1"
    implementation("androidx.paging:paging-common-ktx:$pagingVersion")

    //Javax Inject
    implementation("javax.inject:javax.inject:1")

    //Coroutines
    val coroutinesVersion = "1.6.4"
    api("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion")

    // Unit tests
    testImplementation(project(":testing"))

}
