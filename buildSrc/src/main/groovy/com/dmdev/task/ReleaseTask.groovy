package com.dmdev.task

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction

class ReleaseTask extends DefaultTask {
  @Input
  Boolean release
  @OutputFile
  File releaseFile

  @TaskAction
  void performRelease() {
    println "release in progress..."
  }
}
