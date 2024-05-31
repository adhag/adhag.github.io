rootProject.name = "adhag"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        google ()
        mavenCentral()
        gradlePluginPortal()
    }
    plugins {
        id("com.gradle.enterprise") version("3.17.4")
    }
}

plugins {
    id("com.gradle.enterprise") version "3.17.4"
}

gradleEnterprise {
    if (System.getenv("CI") != null) {
        buildScan {
            publishAlways()
            termsOfServiceUrl = "https://gradle.com/terms-of-service"
            termsOfServiceAgree = "yes"
        }
    }
}

dependencyResolutionManagement {
    repositories {
        google ()
        mavenCentral()
    }
}

include(":composeApp")