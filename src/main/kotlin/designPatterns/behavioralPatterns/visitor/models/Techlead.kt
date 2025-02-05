package designPatterns.behavioralPatterns.visitor.models

import designPatterns.behavioralPatterns.visitor.Employee
import designPatterns.behavioralPatterns.visitor.EmployeeVisitor

class Techlead(val name: String, val teamName: String, val product: String) : Employee {
    override fun accept(visitor: EmployeeVisitor) {
        visitor.checkTechLead(this)
    }
}
