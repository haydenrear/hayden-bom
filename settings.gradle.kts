rootProject.name = "hayden-bom"

dependencyResolutionManagement {
    versionCatalogs {
        repositories {
            mavenLocal()
        }
        create("vC") {
            from("com.hayden:hayden-catalog:0.0.2")
        }
    }
    repositories {
        mavenLocal()
    }
}
