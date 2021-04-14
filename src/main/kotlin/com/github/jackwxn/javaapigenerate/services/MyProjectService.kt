package com.github.jackwxn.javaapigenerate.services

import com.github.jackwxn.javaapigenerate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
