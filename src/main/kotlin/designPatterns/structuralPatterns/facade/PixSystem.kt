package designPatterns.structuralPatterns.facade

class PixSystem {
    fun transfer(sender: UserPix, receiver: UserPix, value: Double): Boolean {
        val success = if (sender.amount >= value) {
            sender.amount -= value
            receiver.amount += value
            true
        } else {
            false
        }
        return success
    }
}
