package designPatterns.behavioralPatterns.mediator

import designPatterns.behavioralPatterns.mediator.appUser.AppUserImpl

fun main() {
    val mediator = ChatMediatorImpl()

    val gerente = AppUserImpl(mediator, "Gerente Jão")
    val correntista = AppUserImpl(mediator, "Correntista Alex")
    val cartunista = AppUserImpl(mediator, "Cartunista Maria")

    mediator.addUser(gerente)
    mediator.addUser(correntista)
    mediator.addUser(cartunista)

    gerente.sendMessage("Olá a todos, Temos uma oferta especial!")
}
