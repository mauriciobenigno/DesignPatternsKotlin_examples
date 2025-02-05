package designPatterns.structuralPatterns.facade

class ReceiverUser {
    private val users = mapOf(
        "fulano" to UserPix("Fulano de Tal", 100.0),
        "sicrano" to UserPix("Sicrano com S de super", 200.0)
    )

    fun getUserData(userName: String): UserPix =
        users[userName] ?: UserPix("desconhecido", 0.0)
}
