package designPatterns.creationalPatterns.singleton

import utils.DataProvider


object SingletonDataManager {
    private val dataProvider by lazy {
        DataProvider
    }

    fun delete(key: String) {
        if (dataProvider.contain(key)) {
            dataProvider.delete(key)
        }
    }

    fun get(key: String): String = dataProvider.get(key) ?: ""

    fun save(key: String, data: String) = dataProvider.save(key, data)
}
