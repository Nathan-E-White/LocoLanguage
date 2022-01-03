package com.github.nathanewhite.locolanguage.services

import com.intellij.openapi.project.Project
import com.github.nathanewhite.locolanguage.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
