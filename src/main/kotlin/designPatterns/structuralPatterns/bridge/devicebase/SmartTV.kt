package designPatterns.structuralPatterns.bridge.devicebase

import designPatterns.structuralPatterns.bridge.DeviceActions
import designPatterns.structuralPatterns.bridge.DeviceControl


class SmartTV(device: DeviceActions) : DeviceControl(device) {

    override fun turnOn() {
        device.turnOn()
    }

    override fun turnOff() {
        device.turnOff()
    }

    override fun amount(amount: Int) {
        device.amount(amount)
    }
}
