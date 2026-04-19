plugins {
  id("java")
  id("maven-publish")
}

group = "io.github.danieluna"
version = "0.12.0"

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
            artifactId = "jadapterfornativetts" // todo en minúsculas
            pom {
                name.set("DAdapterForNativeTTS")
                url.set("https://github.com/Daniel-UNA/DAdapterForNativeTTS")
                scm {
                    url.set("https://github.com/Daniel-UNA/DAdapterForNativeTTS")
                }
            }
        }
    }

    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/Daniel-UNA/DAdapterForNativeTTS")
            credentials {
                username = System.getenv("GITHUB_ACTOR")
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
}
