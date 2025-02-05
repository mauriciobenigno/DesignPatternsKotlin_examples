package designPatterns.behavioralPatterns.state

class CardInvoiceDownloaderImpl : CardInvoiceDownloader {
    private var downloadState : CardInvoiceDownloadState = DownloadNotStarted
    override fun start() {
        downloadState = DownloadInprogress
    }

    override fun finish() {
        downloadState = DownloadCompleted
    }

    override fun checkDownloadState() {
        when (downloadState) {
            is DownloadNotStarted -> println("Download da fatura não iniciado!")
            is DownloadInprogress -> println("Download da fatura em andamento!")
            is DownloadCompleted -> println("Download da fatura completo!")
        }
    }
}
