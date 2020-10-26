package com.github.a434413631.testintellijideaplugin.services

import com.intellij.openapi.project.Project
import com.github.a434413631.testintellijideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
