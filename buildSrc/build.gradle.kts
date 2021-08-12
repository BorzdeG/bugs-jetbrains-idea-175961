plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    api(kotlin("gradle-plugin"))
    implementation("io.gitlab.arturbosch.detekt", "detekt-gradle-plugin", "1.18.0")
}
