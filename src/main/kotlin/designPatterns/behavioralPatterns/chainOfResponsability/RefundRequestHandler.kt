package designPatterns.behavioralPatterns.chainOfResponsability

import designPatterns.behavioralPatterns.chainOfResponsability.model.Request

class RefundRequestHandler : RequestHandlerBase() {
    override fun canHandleRequest(request: Request): Boolean = request.type == "REFUND"

    override fun processRequest(request: Request) {
        println("Registro - solicitação de devolução: ${request.description}")
    }
}
