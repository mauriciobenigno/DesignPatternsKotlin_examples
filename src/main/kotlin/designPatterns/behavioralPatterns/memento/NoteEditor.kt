package designPatterns.behavioralPatterns.memento

class NoteEditor {
    var content: String = ""

    fun createMemento() = NoteMemento(content)

    fun restore(memento: NoteMemento) {
        content = memento.content
    }
}
