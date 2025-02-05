package designPatterns.behavioralPatterns.visitor

interface Employee {
    fun accept(visitor: EmployeeVisitor)
}
