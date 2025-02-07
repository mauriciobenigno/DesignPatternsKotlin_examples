package designPatterns.behavioralPatterns.state

fun main() {
    val cardInvoiceDownloader = CardInvoiceDownloaderImpl()
    cardInvoiceDownloader.checkDownloadState()

    cardInvoiceDownloader.start()

    cardInvoiceDownloader.checkDownloadState()

    cardInvoiceDownloader.finish()

    cardInvoiceDownloader.checkDownloadState()
}
