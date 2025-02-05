package designPatterns.behavioralPatterns.mediator

import designPatterns.behavioralPatterns.mediator.appUser.AppUser

interface ChatMediator {
    fun send(message: String, sender: AppUser, receiverName: String)
    fun sendToAll(message: String, user: AppUser)
    fun addUser(user: AppUser)
}
