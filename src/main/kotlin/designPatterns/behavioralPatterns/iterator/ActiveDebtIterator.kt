package designPatterns.behavioralPatterns.iterator


class ActiveDebtIterator(private val debts: List<ActiveDebt>): Iterator<ActiveDebt> {
    var index = 0
    override fun hasNext() = index < debts.size

    override fun next(): ActiveDebt {
        if (hasNext()) {
            return debts[index++]
        }
        throw NoSuchElementException("No more debts")
    }
}
