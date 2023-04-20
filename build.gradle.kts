plugins {
    kotlin("jvm") version "1.8.0"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://repo.maven.apache.org/maven2/io/kotlintest/")
}

dependencies {
    testImplementation ("org.jetbrains.kotlin:kotlin-test")
    testImplementation(kotlin("test"))
    testImplementation("junit:junit:4.12")
//    testImplementation("io.kotlintest : kotlintest-runner-junit5:3.4.2:kotlintest-runner-junit5-3.4.2.pom")
}


tasks.test {
//    useJUnitPlatform()
    useJUnit()
}

tasks.withType<Test> {
    systemProperty("file.encoding", "UTF-8")
}

kotlin {
    jvmToolchain(11)
}

application {
    mainClass.set("MainKt")
}