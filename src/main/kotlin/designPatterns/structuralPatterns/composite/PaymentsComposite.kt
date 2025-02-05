package designPatterns.structuralPatterns.composite

class PaymentsComposite : Payments {
    private val payments = mutableListOf<Payments>()

    fun addPayment(payment: Payments) {
        payments.add(payment)
    }

    override fun pay() {
        payments.forEach { it.pay() }
    }
}
