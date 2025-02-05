package designPatterns.structuralPatterns.bridge


abstract class DeviceControl(protected val device: DeviceActions) {
    abstract fun turnOn()
    abstract fun turnOff()
    abstract fun amount(amount: Int)
}
