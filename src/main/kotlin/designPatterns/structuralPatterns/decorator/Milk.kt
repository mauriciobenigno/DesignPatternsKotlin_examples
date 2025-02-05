package designPatterns.structuralPatterns.decorator

class Milk(coffee: Coffee) : CoffeeDecorator(coffee) {

    override fun description(): String {
        return "${coffee.description()}, com Leite."
    }

    override fun price(): Double {
        return coffee.price() + 0.5
    }
}
