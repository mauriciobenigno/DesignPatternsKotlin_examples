package designPatterns.behavioralPatterns.mediator.appUser

import designPatterns.behavioralPatterns.mediator.ChatMediator


class AppUserImpl(mediator: ChatMediator, name: String): AppUser(mediator, name) {
    override fun sendMessage(message: String) {
        println("$name enviando mensagem para todos - Conteúdo: $message")
        mediator.sendToAll(message, this)
    }

    override fun receiverMessage(message: String) {
        println("$name recebeu mensagem: $message")
    }
}
