package designPatterns.structuralPatterns.bridge

import designPatterns.structuralPatterns.bridge.SmartLightBulbLG
import designPatterns.structuralPatterns.bridge.SmartTVSamsung
import designPatterns.structuralPatterns.bridge.devicebase.LightBulb
import designPatterns.structuralPatterns.bridge.devicebase.SmartTV

fun main() {
    val tvSamsung = SmartTV(SmartTVSamsung())
    tvSamsung.turnOn()
    tvSamsung.amount(50)
    tvSamsung.turnOff()

    val lampadaLG = LightBulb(SmartLightBulbLG())
    lampadaLG.turnOn()
    lampadaLG.amount(80)
    lampadaLG.turnOff()
}
