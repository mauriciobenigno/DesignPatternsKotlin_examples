package designPatterns.structuralPatterns.proxy

object GetUserProxy: GetUser {

    private var userProxyExample: UserProxyExample? = null
    override fun getUser(): UserProxyExample {
        if (userProxyExample == null) {
            println("Carregando da memoria")
            Thread.sleep(3000);
            userProxyExample = GetUserReal.getUser()
        }
        return (userProxyExample as UserProxyExample).also {
            println("Carregando do cache")
        }
    }
}
