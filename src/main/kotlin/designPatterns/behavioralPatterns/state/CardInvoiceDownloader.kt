package designPatterns.behavioralPatterns.state

interface CardInvoiceDownloader {
    fun start()

    fun finish()

    fun checkDownloadState()
}
