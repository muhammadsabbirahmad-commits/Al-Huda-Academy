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
    }
}

rootProject.name = "Al-Huda-Academy"

// Registering all created modules
include(":app")
include(":feature_auth")
include(":feature_admin")
include(":feature_attendance")
include(":feature_fees")
include(":feature_exam")
include(":feature_notice")
include(":feature_routine")
include(":feature_homework")
include(":feature_library")
include(":feature_transport")
include(":feature_hostel")
include(":feature_staff")
include(":feature_settings")
