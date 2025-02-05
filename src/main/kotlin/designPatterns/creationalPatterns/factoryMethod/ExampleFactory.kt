package designPatterns.creationalPatterns.factoryMethod

import utils.ConfigProvider


object ExampleFactory {

    fun exampleData() {
        val factory = DataProviderFactoryImpl()
        val provider = factory.createDataProvider()
        provider.delete("key")
        provider.get("key")
        provider.save("key", "value")
    }

    fun exampleConfig() {
        val factory: ConfigProviderFactory = ConfigProviderFactoryImpl()
        val toggleProvider: ConfigProvider = factory.createConfigProvider()

        toggleProvider.isConfigEnable("xablau")
    }
}

fun main() {
    ExampleFactory.exampleData()
    ExampleFactory.exampleConfig()
}
