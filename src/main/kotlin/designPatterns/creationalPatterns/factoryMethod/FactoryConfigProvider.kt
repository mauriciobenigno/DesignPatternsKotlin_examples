package designPatterns.creationalPatterns.factoryMethod

import utils.ConfigProvider

interface ConfigProviderFactory {
    fun createConfigProvider(): ConfigProvider
}

class ConfigProviderFactoryImpl : ConfigProviderFactory {
    override fun createConfigProvider(): ConfigProvider = ConfigProvider()
}
