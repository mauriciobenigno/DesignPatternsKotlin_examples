package designPatterns.creationalPatterns.factoryMethod

import utils.DataProvider

interface DataProviderFactory {
    fun createDataProvider(): DataProvider
}

class DataProviderFactoryImpl : DataProviderFactory {
    override fun createDataProvider(): DataProvider = DataProvider
}
