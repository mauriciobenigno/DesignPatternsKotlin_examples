package designPatterns.behavioralPatterns.interpreter

class CalcValue(private val value: Double) : Calculator {
    override fun interpret() = value
}
