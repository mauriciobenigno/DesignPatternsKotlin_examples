package designPatterns.creationalPatterns.singleton

fun main() {
    val key = "teste_salva_texto"
    SingletonDataManager.save(key, "teste")

    println("Texto salvo: ${SingletonDataManager.get(key)}")
}
