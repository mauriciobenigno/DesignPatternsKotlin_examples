package designPatterns.behavioralPatterns.strategy

import designPatterns.behavioralPatterns.strategy.AbortActionStrategy
import designPatterns.behavioralPatterns.strategy.RetryActionStrategy
import designPatterns.behavioralPatterns.strategy.ShowErrorMessageStrategy


fun main() {
    val sistemaArquivos = FileSystem(ShowErrorMessageStrategy())

    sistemaArquivos.readFile("meu_arquivo.txt")
    sistemaArquivos.readFile("arquivo_inexistente.txt")

    sistemaArquivos.defineStrategy(RetryActionStrategy())
    sistemaArquivos.readFile("arquivo_sem_permissao.txt")

    sistemaArquivos.defineStrategy(AbortActionStrategy())
    sistemaArquivos.readFile("arquivo_inexistente.txt")
}