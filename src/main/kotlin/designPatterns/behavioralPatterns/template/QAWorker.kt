package designPatterns.behavioralPatterns.template


class QAWorker : WorkDayTemplate() {
    override fun startWork() {
        println("Ligar notebook e devices de teste, começar a Testar")
    }

    override fun lunchBreak() {
        println("Bater ponto para o horário de almoço")
    }

    override fun returnFromLunch() {
        println("Bater ponto de retorno do almoço")
    }

    override fun endWork() {
        println("Finalizar testes do dia e desligar os devices")
    }
}
