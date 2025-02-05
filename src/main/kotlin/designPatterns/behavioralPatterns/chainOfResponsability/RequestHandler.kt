package designPatterns.behavioralPatterns.chainOfResponsability

import designPatterns.behavioralPatterns.chainOfResponsability.model.Request


interface RequestHandler  {
    fun handleRequest(request: Request)
    fun setNextHandler(handler: RequestHandler): RequestHandler?
}