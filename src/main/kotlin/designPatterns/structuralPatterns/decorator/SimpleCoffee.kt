package designPatterns.structuralPatterns.decorator

class SimpleCoffee : Coffee {
    override fun description(): String {
       return "Café Simples."
    }

    override fun price(): Double {
        return 2.0
    }
}