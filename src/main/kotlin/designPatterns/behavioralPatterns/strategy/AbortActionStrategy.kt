package designPatterns.behavioralPatterns.strategy

class AbortActionStrategy : HandleErrorStrategy {
    override fun handleError(error: Exception) {
        println("Operação abortada.")
    }
}
