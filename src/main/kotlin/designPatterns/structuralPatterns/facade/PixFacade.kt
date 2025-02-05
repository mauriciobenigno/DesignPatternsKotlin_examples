package designPatterns.structuralPatterns.facade

class PixFacade(
    private val senderUser: SenderUser,
    private val receiverUser: ReceiverUser,
    private val pixSystem: PixSystem
) {
    fun transferPix(
        sender: String,
        receiver: String,
        value: Double
    ): Boolean {
        val senderUser = senderUser.getUserData(sender)
        val receiverUser = receiverUser.getUserData(receiver)
        val pixSystem = pixSystem.transfer(senderUser, receiverUser, value)

        println("Transferência de " +
                "${senderUser.userName} para " +
                "${receiverUser.userName} " +
                "no valor de R$$value iniciada!"
        )
        if (pixSystem) {
            println("Transferência realizada com sucesso!")
        } else {
            println("Transferência não realizada, sem saldo suficiente!")
        }
        return pixSystem
    }
}
