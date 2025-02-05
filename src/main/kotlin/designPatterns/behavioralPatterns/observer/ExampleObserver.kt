package designPatterns.behavioralPatterns.observer

fun main() {
    val loggerObserver = LoggerObserver()

    val otherLoggerObserver = OtherLoggerObserver()
    val terminalLoggerObserver = TerminalLoggerObserver()

    loggerObserver.addToObserver(otherLoggerObserver)
    loggerObserver.addToObserver(terminalLoggerObserver)

    loggerObserver.track("Teste de Log")
}