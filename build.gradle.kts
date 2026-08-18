plugins {
    id("java")
    id("org.jetbrains.intellij.platform")
}

group = "com.foreglow.theme"
version = "1.0.1"

repositories {
    mavenCentral()

    // IntelliJ Platform Gradle Plugin Repositories Extension
    intellijPlatform {
        defaultRepositories()
    }
}

dependencies {
    intellijPlatform {
        // Target IDE + version to compile/run against. Any recent IntelliJ
        // Platform build works fine for a pure theme plugin (no PSI/API use).
        intellijIdea("2025.2.6.2")
    }
}

// Nothing else needed: id / name / version / vendor / since-build all live
// in src/main/resources/META-INF/plugin.xml, which is the single source of
// truth the Gradle plugin reads at build time.
