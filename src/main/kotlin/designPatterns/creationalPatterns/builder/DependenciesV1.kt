package designPatterns.creationalPatterns.builder

import utils.ConfigProvider
import utils.DataProvider
import utils.NetworkProvider


class DependenciesV1 private constructor(builder: Builder) {
    val networkProvider: NetworkProvider? = builder.networkProvider
    val dataProvider: DataProvider? = builder.dataProvider
    val configProvider: ConfigProvider? = builder.configProvider

    class Builder {
        var networkProvider: NetworkProvider? = null
        var dataProvider: DataProvider? = null
        var configProvider: ConfigProvider? = null

        fun setRequestProvider(provider: NetworkProvider?) = apply {
            this.networkProvider = provider
        }
        fun setDataProvider(provider: DataProvider?) = apply {
            this.dataProvider = provider
        }
        fun setConfigProvider(provider: ConfigProvider?) = apply {
            this.configProvider = provider
        }

        fun build() = DependenciesV1(this)
    }
}
