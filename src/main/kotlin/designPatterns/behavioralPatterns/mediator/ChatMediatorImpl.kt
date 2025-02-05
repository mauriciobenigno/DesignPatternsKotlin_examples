package designPatterns.behavioralPatterns.mediator

import designPatterns.behavioralPatterns.mediator.appUser.AppUser

class ChatMediatorImpl : ChatMediator {
    private val users = mutableListOf<AppUser>()

    override fun sendToAll(messsage: String, user: AppUser) {
        for (u in users) {
            if (u != user) {
                u.receiverMessage(messsage)
            }
        }
    }

    override fun send(message: String, sender: AppUser, receiverName: String) {
        for (u in users) {
            if (u != sender && u.name.contains(receiverName)) {
                u.receiverMessage(message)
            }
        }
    }

    override fun addUser(user: AppUser) {
        users.add(user)
    }
}
