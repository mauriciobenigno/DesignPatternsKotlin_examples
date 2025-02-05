package utils

class ConfigProvider  {
    fun isConfigEnable(key: String): Boolean {
        val value = DataProvider.get(key)
        return value.toBoolean()
    }
}