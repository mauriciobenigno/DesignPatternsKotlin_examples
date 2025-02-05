package designPatterns.structuralPatterns.proxy

import utils.AnyDataProvider

fun main() {
    val userProxy = UserProxyExample("Morrice", "21/11/1994", "Goiânia")
    AnyDataProvider.save("userproxy", userProxy)

    println("USANDO METODO 1")
    println("Primeiro loading: ${ GetUserProxy.getUser()}")
    println("Segundo loading: ${ GetUserProxy.getUser()}")

    println("USANDO METODO 2")
    println("Primeiro loading: ${ GetUserProxyElegante.getUser()}")
    println("Segundo loading: ${ GetUserProxyElegante.getUser()}")
}
