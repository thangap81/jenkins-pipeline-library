#!/usr/bin/env groovy

def call(String cmd = "ls") {
    
    def result = new StringBuilder() //(1)
    def error     = new StringBuilder()

    def comando = cmd.execute() //(2)
    comando.consumeProcessOutput(resultado, error) //(3)
    comando.waitForOrKill(1000) //(4)

    if (!error.toString().equals("")) //(5)
        println "Error"
    else{
        println "Executed successfully"
        println result //(6)

        }
    
}

