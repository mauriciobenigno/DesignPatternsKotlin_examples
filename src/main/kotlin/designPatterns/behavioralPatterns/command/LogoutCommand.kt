package designPatterns.behavioralPatterns.command

class LogoutCommand(val state: LogoutState) : CommandPattern {

    override fun execute() {
        when (state) {
            LogoutAndClose -> {
                println("Efetuando logout e encerrando o App!")
            }

            LogoutAndRestart -> {
                println("Efetuando logout e reiniciando o App!")
            }
        }
    }
}
