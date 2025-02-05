package designPatterns.behavioralPatterns.interpreter.operators

import designPatterns.behavioralPatterns.interpreter.Calculator

class Multiplication(private val firstVal: Calculator, private val secondVal: Calculator) : Calculator {
    override fun interpret() = firstVal.interpret() * secondVal.interpret()
}
