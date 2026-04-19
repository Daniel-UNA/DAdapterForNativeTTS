plugins {
  id("java")
  id("maven-publish")
}

group = "io.github.jonelo"
version = "0.12.0"

repositories {
  mavenCentral()
}

publishing {
  publications {
    create<MavenPublication>("mavenJava") {
      from(components["java"])                // attach the Java artifact (jar)
      pom {
        name.set("DAdapterForNativeTTS")
        url.set("https://github.com/Daniel-UNA/DAdapterForNativeTTS")
        scm {
          url.set("https://github.com/Daniel-UNA/DAdapterForNativeTTS")
        }
      }
    }
  }
}
