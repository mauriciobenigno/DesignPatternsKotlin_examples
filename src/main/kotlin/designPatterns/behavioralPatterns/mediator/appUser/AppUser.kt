package designPatterns.behavioralPatterns.mediator.appUser

import designPatterns.behavioralPatterns.mediator.ChatMediator

abstract class AppUser(protected val mediator: ChatMediator, val name: String) {
    abstract fun sendMessage(message: String)
    abstract fun receiverMessage(message: String)
}
