package designPatterns.behavioralPatterns.observer

class OtherLoggerObserver: IObserverPattern {
    override fun update(data: Any) {
        val log = data as String
        println("OUTROTIPODELOG - $log")
    }
}
