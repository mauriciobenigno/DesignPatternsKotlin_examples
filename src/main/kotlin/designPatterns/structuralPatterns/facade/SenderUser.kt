package designPatterns.structuralPatterns.facade

class SenderUser {
    private val users = mapOf(
        "joao" to UserPix("João Pereira", 100.0),
        "maria" to UserPix("Maria Silva", 200.0)
    )
    fun getUserData(userName: String): UserPix =
        users[userName] ?: UserPix("", 0.0)
}
