plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
    api(project(":core"))
    
    //Paging3 Common
    val pagingVersion = "3.1.1"
    implementation("androidx.paging:paging-common-ktx:$pagingVersion")

    api("junit:junit:4.13.2")
    api("androidx.arch.core:core-testing:2.1.0")
    api("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.5.1")
    api("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
}