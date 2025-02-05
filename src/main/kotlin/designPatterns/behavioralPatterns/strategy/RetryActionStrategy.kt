package designPatterns.behavioralPatterns.strategy

class RetryActionStrategy : HandleErrorStrategy {
    override fun handleError(error: Exception) {
        println("Tentando novamente...")
    }
}
