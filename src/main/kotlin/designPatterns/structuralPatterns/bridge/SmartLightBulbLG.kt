package designPatterns.structuralPatterns.bridge


class SmartLightBulbLG : DeviceActions {
    override fun turnOn() {
        println("Lâmpada LG ligada")
    }

    override fun turnOff() {
        println("Lâmpada LG desligada")
    }

    override fun amount(amount: Int) {
        println("Brilho da lâmpada LG ajustado para $amount")
    }

}
