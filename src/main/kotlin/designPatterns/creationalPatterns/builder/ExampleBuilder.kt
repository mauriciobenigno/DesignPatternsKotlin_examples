package designPatterns.creationalPatterns.builder

import designPatterns.creationalPatterns.abstractFactory.DependenciesAbstractFactory
import designPatterns.creationalPatterns.abstractFactory.DependenciesAbstractFactoryImpl
import utils.ConfigProvider
import utils.DataProvider
import utils.NetworkProvider

object ExampleBuilder {


    var networkProvider: NetworkProvider? = null
    var configProvider: ConfigProvider? = null
    var dataProvider: DataProvider? = null

    init {
        networkProvider = NetworkProvider()

        val abstractFactory: DependenciesAbstractFactory = DependenciesAbstractFactoryImpl()
        configProvider = abstractFactory.createConfigProvider()
        dataProvider = abstractFactory.createDataProvider()
    }

    fun mainV1() {
        DependenciesV1.Builder()
            .setRequestProvider(networkProvider)
            .setDataProvider(dataProvider)
            .setConfigProvider(configProvider)
            .build()
    }

    fun mainV2() {
        DependenciesV2Builder()
            .setNetworkProvider(networkProvider)
            .setDataProvider(dataProvider)
            .setConfigProvider(configProvider)
            .build()
    }
}

fun main() {
    ExampleBuilder.mainV1()
    ExampleBuilder.mainV2()
}
