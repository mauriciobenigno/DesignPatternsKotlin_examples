package designPatterns.behavioralPatterns.template

class DevWorker : WorkDayTemplate() {
    override fun startWork() {
        println("Ligar notebook e 'codar'")
    }

    override fun lunchBreak() {
        println("Bater ponto para o horário de almoço")
    }

    override fun returnFromLunch() {
        println("Bater ponto de retorno do almoço")
    }

    override fun endWork() {
        println("Parar de 'codar' e Desligar notebook")
    }
}
