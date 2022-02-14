plugins {
    `java-library`
    id("au.net.causal.adl") version "0.1.1"
}

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

adl {
    version = "0.14"
    generations {
        java {
            javaPackage  = "adl.tester"
            isGenerateTransitive = true
            isGenerateAdlRuntime = true
        }
    }
}

dependencies {
    implementation("com.google.code.gson:gson:2.8.6")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testImplementation("org.assertj:assertj-core:3.18.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks {
    test {
        useJUnitPlatform()
    }
}
