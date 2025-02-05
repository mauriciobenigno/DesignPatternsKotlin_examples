package designPatterns.behavioralPatterns.visitor

import designPatterns.behavioralPatterns.visitor.models.ProductOwner
import designPatterns.behavioralPatterns.visitor.models.Techlead

class ReportVisitor : EmployeeVisitor {
    override fun checkProductOwner(po: ProductOwner) {
        val produtos = po.products.joinToString(" - ")
        println("Relatorio de Dono de Produto: \nNome - ${po.name} \nTamanho da Equipe - ${po.teamSize}\nProdutos: $produtos")
    }

    override fun checkTechLead(tl: Techlead) {
        println("Relatório de TechLead: Nome - ${tl.name}, Squad - ${tl.teamName} - Produto: ${tl.product}")
    }
}
