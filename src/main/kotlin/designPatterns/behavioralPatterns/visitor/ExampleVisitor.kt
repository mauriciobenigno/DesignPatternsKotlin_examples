package designPatterns.behavioralPatterns.visitor

import designPatterns.behavioralPatterns.visitor.models.ProductOwner
import designPatterns.behavioralPatterns.visitor.models.Techlead

fun main() {
    val employees: List<Employee> = listOf(
        ProductOwner("Victoria Benigno", 2, listOf("Sistema Top", "Sistema Bruto")),
        Techlead("Gustavo Lima", "Magos", "Sistema Bruto"),
        Techlead("Joelma Calipso", "Lendarios", "Sistema Top"),
        ProductOwner("Rei Péle", 1, listOf("Bola no gol")),
        Techlead("Cristiano Ronaldo", "Craques", "Bola no gol"),
    )
    val reportVisitor = ReportVisitor()
    for (employee in employees) {
        employee.accept(reportVisitor)
    }
}
