package designPatterns.structuralPatterns.adapter


class PinAdapter(private val device: ElectronicDevice) : TwoPinSocket {

    override fun connectTwoPinOnSocket() {
        println("Adaptador de tomada conectado na tomada de dois pinos.")
        device.connectThreePinOnSocket()
    }
}
