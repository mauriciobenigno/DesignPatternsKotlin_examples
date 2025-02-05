package designPatterns.behavioralPatterns.visitor.models

import designPatterns.behavioralPatterns.visitor.Employee
import designPatterns.behavioralPatterns.visitor.EmployeeVisitor

class ProductOwner(val name: String, val teamSize: Int, val products: List<String>) : Employee {
    override fun accept(visitor: EmployeeVisitor) {
        visitor.checkProductOwner(this)
    }
}
