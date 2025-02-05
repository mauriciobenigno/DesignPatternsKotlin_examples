package designPatterns.structuralPatterns.decorator

class Chocolate(coffee: Coffee) : CoffeeDecorator(coffee) {

    override fun description(): String {
        return "${coffee.description()}, com Chocolate."
    }

    override fun price(): Double {
        return coffee.price() + 1.0
    }
}
