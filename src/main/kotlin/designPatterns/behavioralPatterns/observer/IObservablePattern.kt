package designPatterns.behavioralPatterns.observer

interface IObservablePattern {
    val observers: MutableCollection<IObserverPattern>

    fun addToObserver(observer: IObserverPattern) = observers.add(observer)

    fun removeFromObserver(observer: IObserverPattern) = observers.remove(observer)

    fun notifyObservers(data: Any) {
        observers.forEach {
            it.update(data)
        }
    }
}
