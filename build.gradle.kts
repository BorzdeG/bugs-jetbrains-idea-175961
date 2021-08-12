import io.gitlab.arturbosch.detekt.DetektPlugin
import io.gitlab.arturbosch.detekt.extensions.DetektExtension

apply<DetektPlugin>()
subprojects {
    repositories {
        mavenCentral()
    }

    apply<DetektPlugin>()
}

configure<DetektExtension> {
    buildUponDefaultConfig = true
}
