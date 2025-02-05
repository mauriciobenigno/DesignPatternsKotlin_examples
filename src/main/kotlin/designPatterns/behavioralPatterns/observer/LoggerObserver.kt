package designPatterns.behavioralPatterns.observer

class LoggerObserver : IObservablePattern {
    override val observers: MutableCollection<IObserverPattern> = mutableListOf()
    fun track(log: String) {
        notifyObservers(log)
    }
}
