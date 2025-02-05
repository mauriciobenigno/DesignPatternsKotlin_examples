package designPatterns.behavioralPatterns.template

fun main() {
    val devWorker = DevWorker()
    val qaWorker = QAWorker()

    println("Dia de trabalho do Dev:")
    devWorker.workDayRoutine()

    println("Dia de trabalho do QA:")
    qaWorker.workDayRoutine()
}
