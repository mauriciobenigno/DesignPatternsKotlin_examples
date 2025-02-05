package designPatterns.creationalPatterns.prototype

import designPatterns.creationalPatterns.prototype.ExamplePrototype.createUser
import designPatterns.creationalPatterns.prototype.enum.LoginUserType

object ExamplePrototype {

    private val prototypeClients = mutableListOf<LoginPrototype>()
    private val clients = mutableListOf<LoginPrototype>()
    private const val MAGIC_NUMBER_100 = 100.0
    private const val MAGIC_NUMBER_500 = 500.0
    private const val MAGIC_NUMBER_900 = 900.0

    init {
        prototypeClients.add(LoginPrototype("laranjão", LoginUserType.ADMIN, MAGIC_NUMBER_100))
        prototypeClients.add(LoginPrototype("azuzim", LoginUserType.COMUM, MAGIC_NUMBER_500))
        prototypeClients.add(LoginPrototype("azulão", LoginUserType.MODERADOR, MAGIC_NUMBER_900))
    }

    fun createUser(
        name: String,
        type: LoginUserType
    ) {
        for (user in prototypeClients) {
            if (user.type == type) {
                val newUser = user.copy(name = name)
                clients.add(newUser)
                println("User created: $newUser")
                return
            }
        }
    }
}

fun main() {
    createUser("Fulano Admin", LoginUserType.ADMIN)
    createUser("Ciclano Comum", LoginUserType.COMUM)
    createUser("Beltrano Moderador", LoginUserType.MODERADOR)
}

