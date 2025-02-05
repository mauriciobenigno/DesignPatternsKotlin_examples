package designPatterns.creationalPatterns.builder

import utils.ConfigProvider
import utils.DataProvider
import utils.NetworkProvider

class DependenciesV2Builder {
    private var networkProvider: NetworkProvider? = null
    private var dataProvider: DataProvider? = null
    private var configProvider: ConfigProvider? = null

    fun setNetworkProvider(provider: NetworkProvider?) = apply {
        this.networkProvider = provider
    }
    fun setDataProvider(provider: DataProvider?) = apply {
        this.dataProvider = provider
    }
    fun setConfigProvider(provider: ConfigProvider?) = apply {
        this.configProvider = provider
    }

    data class SaDependenciesV2 internal constructor(
        val networkProvider: NetworkProvider?,
        val dataProvider: DataProvider?,
        val configProvider: ConfigProvider?,
    )

    fun build() = SaDependenciesV2(networkProvider, dataProvider, configProvider)
}
