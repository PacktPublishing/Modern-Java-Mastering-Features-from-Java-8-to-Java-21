plugins {
    id("java")
}

group = "org.example"
version = ""


repositories {
    mavenCentral()
}

dependencies {
    //jackson for json serialization/deserialization
    implementation("com.fasterxml.jackson.core:jackson-databind:2.14.1")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.14.1")


    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}