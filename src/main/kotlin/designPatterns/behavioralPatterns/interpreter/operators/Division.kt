package designPatterns.behavioralPatterns.interpreter.operators

import designPatterns.behavioralPatterns.interpreter.Calculator

class Division(private val firstVal: Calculator, private val secondVal: Calculator) : Calculator {
    override fun interpret() = firstVal.interpret() / secondVal.interpret()
}
