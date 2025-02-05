package designPatterns.behavioralPatterns.visitor

import designPatterns.behavioralPatterns.visitor.models.ProductOwner
import designPatterns.behavioralPatterns.visitor.models.Techlead

interface EmployeeVisitor {
    fun checkProductOwner(po: ProductOwner)
    fun checkTechLead(tl: Techlead)
}
