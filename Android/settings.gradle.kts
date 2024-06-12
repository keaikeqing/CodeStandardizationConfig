pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = uri ("https://jitpack.io") }
    }
}
plugins {
    // See https://jmfayard.github.io/refreshVersions
    id("de.fayard.refreshVersions") version "0.60.5"
}
refreshVersions {
    rejectVersionIf {
        // 使用至少同样稳定的开发版本时才显示开发版本
        candidate.stabilityLevel.isLessStableThan(current.stabilityLevel)
    }
}


rootProject.name = "honkai"
include(":app")
