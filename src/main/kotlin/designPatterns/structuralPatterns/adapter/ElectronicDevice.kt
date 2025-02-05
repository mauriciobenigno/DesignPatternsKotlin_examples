package designPatterns.structuralPatterns.adapter

class ElectronicDevice : ThreePinSocket {
    override fun connectThreePinOnSocket() {
        println("Device conectado na tomada de 3 pinos.")
    }
}