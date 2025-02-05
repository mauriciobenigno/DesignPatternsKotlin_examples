package designPatterns.behavioralPatterns.chainOfResponsability

import designPatterns.behavioralPatterns.chainOfResponsability.model.Request

class ProductEnquiryHandler : RequestHandlerBase() {
    override fun canHandleRequest(request: Request): Boolean = request.type == "PRODUCT"

    override fun processRequest(request: Request) {
        println("Registro - Dúvida de produto: ${request.description}")
    }
}
