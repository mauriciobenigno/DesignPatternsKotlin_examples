package designPatterns.structuralPatterns.composite

class CreditCard : Payments {
    override fun pay() {
        println("Payment with credit card")
    }
}
