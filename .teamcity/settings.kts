import jetbrains.buildServer.configs.kotlin.v2019_2.*

/*
The settings script is an entry point for defining a TeamCity
project hierarchy. The script should contain a single call to the
project() function with a Project instance or an init function as
an argument.

VcsRoots, BuildTypes, Templates, and subprojects can be
registered inside the project using the vcsRoot(), buildType(),
template(), and subProject() methods respectively.

To debug settings scripts in command-line, run the

    mvnDebug org.jetbrains.teamcity:teamcity-configs-maven-plugin:generate

command and attach your debugger to the port 8000.

To debug in IntelliJ Idea, open the 'Maven Projects' tool window (View
-> Tool Windows -> Maven Projects), find the generate task node
(Plugins -> teamcity-configs -> teamcity-configs:generate), the
'Debug' option is available in the context menu for the task.
*/

version = "2021.1"

project {

    buildType(id74166)
    buildType(BuildConfig)

    template(Tmpl)
}

object id74166 : BuildType({
    id("74166")
    name = "74166"
})

object BuildConfig : BuildType({
    name = "build config"
})

object Tmpl : Template({
    name = "tmpl"

    params {
        password("par1", "credentialsJSON:04302971-d408-4f3a-ac21-ce2e074b2d11")
    }
})
