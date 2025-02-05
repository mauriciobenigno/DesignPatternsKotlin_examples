package designPatterns.structuralPatterns.decorator

abstract class CoffeeDecorator(protected val coffee: Coffee) : Coffee {
    abstract override fun description(): String
    abstract override fun price(): Double
}
