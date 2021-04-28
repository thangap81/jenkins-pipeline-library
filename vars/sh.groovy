def call(String cmd) {

    def cmdOutput = sh(returnStdout: true, script: ${cmd}).trim()
    println ("command output is ${cmdOutput}")
}
