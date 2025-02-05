package designPatterns.structuralPatterns.bridge


class SmartTVSamsung : DeviceActions {
    override fun turnOn() {
        println("TV Samsung ligada")
    }

    override fun turnOff() {
        println("TV Samsung desligada")
    }

    override fun amount(amount: Int) {
        println("Volume da TV Samsung ajustado para $amount")
    }

}
