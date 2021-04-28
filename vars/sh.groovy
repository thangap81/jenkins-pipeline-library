#!/usr/bin/env groovy

def call(String cmd = "ls") {

    println ("command parameter ${cmd}")
    def cmdOutput = sh(returnStdout: true, script: cmd).trim()
    println ("command output is ${cmdOutput}")
}

