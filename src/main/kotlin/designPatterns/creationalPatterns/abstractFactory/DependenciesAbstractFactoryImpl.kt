package designPatterns.creationalPatterns.abstractFactory

import designPatterns.creationalPatterns.factoryMethod.ConfigProviderFactory
import designPatterns.creationalPatterns.factoryMethod.ConfigProviderFactoryImpl
import designPatterns.creationalPatterns.factoryMethod.DataProviderFactoryImpl
import utils.ConfigProvider
import utils.DataProvider


interface DependenciesAbstractFactory {
    fun createConfigProvider(): ConfigProvider

    fun createDataProvider(): DataProvider
}

class DependenciesAbstractFactoryImpl : DependenciesAbstractFactory {

    override fun createConfigProvider(): ConfigProvider {
        val factory: ConfigProviderFactory = ConfigProviderFactoryImpl()
        return factory.createConfigProvider()
    }

    override fun createDataProvider(): DataProvider {
        val factory = DataProviderFactoryImpl()
        return factory.createDataProvider()
    }
}
