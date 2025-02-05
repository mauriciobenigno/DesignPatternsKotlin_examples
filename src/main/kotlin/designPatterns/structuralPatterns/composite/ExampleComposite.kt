package designPatterns.structuralPatterns.composite

fun main() {
    val creditCard = CreditCard()
    val debitCard = DebitCard()
    val pixPayment = PixPayment()

    val payment = PaymentsComposite()
    payment.addPayment(creditCard)
    payment.addPayment(debitCard)
    payment.addPayment(pixPayment)

    payment.pay()
}
