package com.github.bulentkopuklu.intellijthemessolarized.services

import com.intellij.openapi.project.Project
import com.github.bulentkopuklu.intellijthemessolarized.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
