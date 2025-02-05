package designPatterns.structuralPatterns.flyweight

object TransactionTypeFactory {
    private val transactionTypes = mutableMapOf<String, TransactionType>()

    fun getTransactionType(name: String) =
        transactionTypes.computeIfAbsent(name) { TransactionType(name) }
}
