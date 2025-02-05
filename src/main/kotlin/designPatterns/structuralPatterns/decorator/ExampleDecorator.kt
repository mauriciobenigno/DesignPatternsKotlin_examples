package designPatterns.structuralPatterns.decorator

fun main() {
    val simpleCoffee = SimpleCoffee()
    println("${simpleCoffee.description()} - R$${simpleCoffee.price()}")

    val coffeeWithMilk = Milk(simpleCoffee)
    println("${coffeeWithMilk.description()} - R$${coffeeWithMilk.price()}")

    val coffeeWithChocolate = Chocolate(simpleCoffee)
    println("${coffeeWithChocolate.description()} - R$${coffeeWithChocolate.price()}")

    val coffeWithChocolateAndMilk = Chocolate(Milk(simpleCoffee))
    println("${coffeWithChocolateAndMilk.description()} - R$${coffeWithChocolateAndMilk.price()}")
}
