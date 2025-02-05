package designPatterns.behavioralPatterns.chainOfResponsability

import designPatterns.behavioralPatterns.chainOfResponsability.model.Request

class CustomerSupportService {
    private var firstHandler: RequestHandler? = null
    private var lastHandler: RequestHandler? = null

    fun addHandler(handler: RequestHandler) {
        if (firstHandler == null) {
            firstHandler = handler
            lastHandler = handler
        } else {
            lastHandler?.setNextHandler(handler)
            lastHandler = handler
        }
    }

    fun receiveRequest(request: Request) {
        firstHandler?.handleRequest(request) ?: println("Nenhum handler definido para a requisição.")
    }
}