plugins {
    id("com.android.application") version Version.Android apply false
    id("com.android.library") version Version.Android apply false
    id("org.jetbrains.kotlin.android") version Version.Kotlin apply false
    id("org.jetbrains.kotlin.jvm") version Version.Kotlin apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}

