package designPatterns.behavioralPatterns.iterator

object ActiveDebtHelper {

    fun makeIterator(debts: List<ActiveDebt>): Iterator<ActiveDebt> = ActiveDebtIterator(debts)
}
