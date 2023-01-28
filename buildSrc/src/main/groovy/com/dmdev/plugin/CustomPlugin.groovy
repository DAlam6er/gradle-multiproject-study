package com.dmdev.plugin

import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project

class CustomPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        def map = [description: "Hello task", group: "dmdev", type: DefaultTask]
        project.task(map, "customHello") {
            println "configuration phase. Task customHello."
            doLast {
                println "execution phase, Action 1"
            }
            doFirst {
                println "execution phase, Action 2"
            }
            doLast {
                println "execution phase, Action 3"
            }

            println "task: $description, group: $group, actions: ${actions.size()}"
            println "path task: $path"
        }
    }
}
