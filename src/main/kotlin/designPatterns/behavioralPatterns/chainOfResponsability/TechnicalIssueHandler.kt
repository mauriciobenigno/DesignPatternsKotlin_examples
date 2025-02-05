package designPatterns.behavioralPatterns.chainOfResponsability

import designPatterns.behavioralPatterns.chainOfResponsability.model.Request

class TechnicalIssueHandler : RequestHandlerBase() {
    override fun canHandleRequest(request: Request): Boolean = request.type == "TECHNICAL"

    override fun processRequest(request: Request) {
        println("Registro - Problema técnico: ${request.description}")
    }
}
