package designPatterns.behavioralPatterns.chainOfResponsability

import designPatterns.behavioralPatterns.chainOfResponsability.model.Request

abstract class RequestHandlerBase : RequestHandler {
    private var nextHandler: RequestHandler? = null

    override fun setNextHandler(handler: RequestHandler): RequestHandler? {
        this.nextHandler = handler
        return handler
    }

    override fun handleRequest(request: Request) {
        if (canHandleRequest(request)) {
            processRequest(request)
        } else {
            nextHandler?.handleRequest(request)
        }
    }

    protected abstract fun canHandleRequest(request: Request): Boolean
    protected abstract fun processRequest(request: Request)
}
