package designPatterns.structuralPatterns.flyweight


fun main() {
    val transactions = mutableListOf<Transaction>()

    val depositType = TransactionTypeFactory.getTransactionType("Depósito")
    transactions.add(Transaction(100.0, depositType))
    transactions.add(Transaction(200.0, depositType))

    val withdrawalType = TransactionTypeFactory.getTransactionType("Saque")
    transactions.add(Transaction(50.0, withdrawalType))
    transactions.add(Transaction(75.0, withdrawalType))

    val paymentType = TransactionTypeFactory.getTransactionType("Pagamento")
    transactions.add(Transaction(10.0, paymentType))
    transactions.add(Transaction(20.0, paymentType))

    for (transaction in transactions) {
        transaction.process()
    }
}
