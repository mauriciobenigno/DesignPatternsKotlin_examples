package designPatterns.behavioralPatterns.iterator

fun main() {

    val debts = listOf(
        ActiveDebt(1.0, 500.0),
        ActiveDebt(2.0, 250.0),
        ActiveDebt(3.0, 750.0),
        ActiveDebt(4.0, 1000.0)
    )

    val iterator = ActiveDebtHelper.makeIterator(debts)

    while (iterator.hasNext()) {
        val debt = iterator.next()
        println("Dívida id: ${debt.idDebt} - Valor: R$ ${debt.value}")
    }
}
