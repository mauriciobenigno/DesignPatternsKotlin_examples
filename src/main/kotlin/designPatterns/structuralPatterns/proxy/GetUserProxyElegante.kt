package designPatterns.structuralPatterns.proxy

object GetUserProxyElegante: GetUser {

    private val userProxyExample: UserProxyExample by lazy {
        GetUserReal.getUser()
    }.also {
        Thread.sleep(3000);
        println("Carregando da memoria")
    }

    override fun getUser(): UserProxyExample {
        return userProxyExample.also {
            println("Carregado do cache")
        }
    }
}
