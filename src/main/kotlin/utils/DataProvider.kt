package utils


object DataProvider {
    private val map = hashMapOf<String, String>()
    fun delete(key: String) {
        map.also {
            if (it.containsKey(key)) {
                it.remove(key)
            }
        }
    }

    fun get(key: String): String? {
        return map[key]
    }

    fun save(key: String, data: String) {
        map[key] = data
    }

    fun contain(key: String) = map.containsKey(key)
}
