package designPatterns.creationalPatterns.abstractFactory

import utils.ConfigProvider
import utils.DataProvider


fun main() {
    val abstractFactory: DependenciesAbstractFactory = DependenciesAbstractFactoryImpl()
    val configProvider: ConfigProvider = abstractFactory.createConfigProvider()
    val dataProvider: DataProvider = abstractFactory.createDataProvider()
    dataProvider.save("dado_salvo", "1")
    configProvider.isConfigEnable("dado_salvo")
}
