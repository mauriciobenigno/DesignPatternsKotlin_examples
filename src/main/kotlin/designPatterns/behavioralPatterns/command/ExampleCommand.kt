package designPatterns.behavioralPatterns.command

fun main() {
    val list = listOf<CommandPattern>(
        LogoutCommand(LogoutAndRestart),
        LogoutCommand(LogoutAndClose)
    )

    list.forEach { it.execute() }
}
