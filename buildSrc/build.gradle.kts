plugins {
    `kotlin-dsl`
    id("com.diffplug.spotless") version "5.12.1"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("commons-configuration:commons-configuration:1.9")
    implementation("commons-jxpath:commons-jxpath:1.3")
    implementation("commons-codec:commons-codec:1.11")

    val flexmarkVersion = "0.50.48"
    implementation("com.vladsch.flexmark:flexmark-java:$flexmarkVersion")
    implementation("com.vladsch.flexmark:flexmark-ext-gfm-strikethrough:$flexmarkVersion")
    implementation("com.vladsch.flexmark:flexmark-ext-gfm-tasklist:$flexmarkVersion")
    implementation("com.vladsch.flexmark:flexmark-ext-tables:$flexmarkVersion")
    implementation("com.vladsch.flexmark:flexmark-ext-yaml-front-matter:$flexmarkVersion")

    implementation("com.vladsch.flexmark:flexmark-html2md-converter:$flexmarkVersion")
    implementation("com.vladsch.flexmark:flexmark-ext-anchorlink:$flexmarkVersion")
    implementation("com.vladsch.flexmark:flexmark-profile-pegdown:$flexmarkVersion")

    implementation("org.apache.commons:commons-lang3:3.9")
    val jgitVersion = "5.6.0.201912101111-r"
    implementation("org.eclipse.jgit:org.eclipse.jgit:$jgitVersion")
    implementation("org.eclipse.jgit:org.eclipse.jgit.archive:$jgitVersion")
    implementation("org.kohsuke:github-api:1.106")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.11.1")
    implementation("org.snakeyaml:snakeyaml-engine:2.0")
    implementation("org.zaproxy:zap:2.9.0")
}

spotless {
    java {
        licenseHeaderFile("../docs/headers/license.java")

        googleJavaFormat("1.7").aosp()
    }

    kotlin {
        ktlint()
    }

    kotlinGradle {
        ktlint()
    }
}
