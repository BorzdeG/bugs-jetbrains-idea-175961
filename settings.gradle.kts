plugins {
    id("com.gradle.enterprise") version "3.6.3"
}
gradleEnterprise {
    buildScan {
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"
    }
}

include(":sub-module-0")