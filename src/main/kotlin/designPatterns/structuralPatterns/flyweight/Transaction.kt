package designPatterns.structuralPatterns.flyweight


class Transaction(private val amount: Double, private val type: TransactionType) {
    fun process() {
        println("Processando transação do tipo ${type.name} com valor: $amount")
    }
}
