package designPatterns.structuralPatterns.composite

class PixPayment : Payments {
    override fun pay() {
        println("Payment with Pix")
    }
}
