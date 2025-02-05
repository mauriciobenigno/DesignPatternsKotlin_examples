package designPatterns.creationalPatterns.prototype

import designPatterns.creationalPatterns.prototype.enum.LoginUserType

data class LoginPrototype(
    val name: String,
    val type: LoginUserType,
    val moneyBalance: Double
)
