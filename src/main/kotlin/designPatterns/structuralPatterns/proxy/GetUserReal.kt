package designPatterns.structuralPatterns.proxy

import utils.AnyDataProvider


object GetUserReal : GetUser {
    override fun getUser(): UserProxyExample = AnyDataProvider.get("userproxy") as UserProxyExample
}
