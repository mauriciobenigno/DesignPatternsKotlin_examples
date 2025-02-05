package designPatterns.behavioralPatterns.state

object ExampleState {

    fun main() {
        val cardInvoiceDownloader = CardInvoiceDownloaderImpl()
        cardInvoiceDownloader.checkDownloadState()

        cardInvoiceDownloader.start()

        cardInvoiceDownloader.checkDownloadState()

        cardInvoiceDownloader.finish()

        cardInvoiceDownloader.checkDownloadState()
    }
}
