package designPatterns.structuralPatterns.bridge

interface DeviceActions {
    fun turnOn()
    fun turnOff()
    fun amount(amount: Int)
}