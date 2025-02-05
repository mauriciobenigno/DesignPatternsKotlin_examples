package designPatterns.behavioralPatterns.template

abstract class WorkDayTemplate {
    fun workDayRoutine() {
        clockIn()
        startWork()
        lunchBreak()
        returnFromLunch()
        endWork()
        clockOut()
    }

    private fun clockIn() {
        println("Bater ponto de entrada")
    }

    private fun clockOut() {
        println("Bater ponto de saída")
    }

    abstract fun startWork()
    abstract fun lunchBreak()
    abstract fun returnFromLunch()
    abstract fun endWork()
}
