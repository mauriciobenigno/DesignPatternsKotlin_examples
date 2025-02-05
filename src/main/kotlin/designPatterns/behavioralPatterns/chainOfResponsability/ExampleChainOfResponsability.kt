package designPatterns.behavioralPatterns.chainOfResponsability

import designPatterns.behavioralPatterns.chainOfResponsability.model.Request


fun main() {

    val supportService = CustomerSupportService()

    // Antes de ter qualquer handler
    val invalidRequest = Request("UNKNOWN", "É aqui que vende pastel?")
    supportService.receiveRequest(invalidRequest)

    val technicalHandler = TechnicalIssueHandler()
    val productHandler = ProductEnquiryHandler()
    val refundHandler = RefundRequestHandler()

    supportService.addHandler(technicalHandler)
    supportService.addHandler(productHandler)
    supportService.addHandler(refundHandler)

    val technicalRequest = Request("TECHNICAL", "Meu notebook não liga.")
    supportService.receiveRequest(technicalRequest)

    val productRequest = Request("PRODUCT", "Esse notebook tem qual processador?")
    supportService.receiveRequest(productRequest)

    val productRequest2 = Request("PRODUCT", "Esse notebook tem quantos GB de memoria?")
    supportService.receiveRequest(productRequest2)

    val refundRequest = Request("REFUND", "Eu não gostei, esse notebook nem liga, quero o dinheiro de volta..")
    supportService.receiveRequest(refundRequest)

    val productRequest3 = Request("PRODUCT", "Esse notebook rodava jogo?")
    supportService.receiveRequest(productRequest3)
}
