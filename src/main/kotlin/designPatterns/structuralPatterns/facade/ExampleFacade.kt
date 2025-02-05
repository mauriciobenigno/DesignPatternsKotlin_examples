package designPatterns.structuralPatterns.facade


fun main() {
    val pixFacade = PixFacade(
        SenderUser(),
        ReceiverUser(),
        PixSystem()
    )

    pixFacade.transferPix("joao", "fulano", 50.0)

    pixFacade.transferPix("maria", "sicrano", 250.0)
}
