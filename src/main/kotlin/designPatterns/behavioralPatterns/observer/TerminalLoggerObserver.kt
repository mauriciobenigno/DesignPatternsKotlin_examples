package designPatterns.behavioralPatterns.observer


class TerminalLoggerObserver: IObserverPattern {
    override fun update(data: Any) {
        val log = data as String
        println("${this::class.java.simpleName} - $log")
    }
}
