package utils


object AnyDataProvider {
    private val map = hashMapOf<String, Any>()
    fun delete(key: String) {
        map.also {
            if (it.containsKey(key)) {
                it.remove(key)
            }
        }
    }

    fun get(key: String): Any? {
        return map[key]
    }

    fun save(key: String, data: Any) {
        map[key] = data
    }

    fun contain(key: String) = map.containsKey(key)
}
