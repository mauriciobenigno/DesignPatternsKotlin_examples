package designPatterns.behavioralPatterns.strategy

class ShowErrorMessageStrategy : HandleErrorStrategy {
    override fun handleError(error: Exception) {
        println("Erro: ${error.message}")
    }
}
