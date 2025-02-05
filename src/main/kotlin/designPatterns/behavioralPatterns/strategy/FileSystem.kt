package designPatterns.behavioralPatterns.strategy

import designPatterns.behavioralPatterns.strategy.HandleErrorStrategy

class FileSystem(private var strategy: HandleErrorStrategy) {
    fun defineStrategy(strategy: HandleErrorStrategy) {
        this.strategy = strategy
    }

    fun readFile(fileName: String) {
        try {
            if (fileName == "arquivo_inexistente.txt") {
                throw java.io.FileNotFoundException("Arquivo não encontrado: $fileName")
            } else if (fileName == "arquivo_sem_permissao.txt") {
                throw SecurityException("Sem permissão para ler o arquivo: $fileName")
            } else {
                println("Arquivo lido com sucesso: $fileName")
            }
        } catch (erro: Exception) {
            strategy.handleError(erro)
        }
    }
}
