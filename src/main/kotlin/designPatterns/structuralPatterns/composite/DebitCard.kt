package designPatterns.structuralPatterns.composite

class DebitCard : Payments {
    override fun pay() {
        println("Payment with debit card")
    }
}
