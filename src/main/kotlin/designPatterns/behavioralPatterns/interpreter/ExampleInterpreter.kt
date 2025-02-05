package designPatterns.behavioralPatterns.interpreter

import designPatterns.behavioralPatterns.interpreter.operators.Addition
import designPatterns.behavioralPatterns.interpreter.operators.Division
import designPatterns.behavioralPatterns.interpreter.operators.Multiplication
import designPatterns.behavioralPatterns.interpreter.operators.Subtraction

fun main() {
    // Expressão: ((5 + 3) * 2) - (8 / 2)
    val expressao = Subtraction(
        Multiplication(
            Addition(CalcValue(5.0), CalcValue(3.0)),
            CalcValue(2.0)
        ),
        Division(CalcValue(8.0), CalcValue(2.0))
    )

    val resultado = expressao.interpret()
    println("Resultado da expressão: $resultado") // Saída: Resultado da expressão: 12
}
