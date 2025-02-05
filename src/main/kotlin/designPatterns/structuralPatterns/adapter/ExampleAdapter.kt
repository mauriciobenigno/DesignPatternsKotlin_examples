package designPatterns.structuralPatterns.adapter

import designPatterns.structuralPatterns.adapter.ElectronicDevice
import designPatterns.structuralPatterns.adapter.PinAdapter


fun main() {
    val device = ElectronicDevice()
    val adapter = PinAdapter(device)

    adapter.connectTwoPinOnSocket()
}
