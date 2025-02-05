package designPatterns.behavioralPatterns.state

sealed class CardInvoiceDownloadState

object DownloadNotStarted : CardInvoiceDownloadState()
object DownloadInprogress : CardInvoiceDownloadState()
object DownloadCompleted : CardInvoiceDownloadState()
