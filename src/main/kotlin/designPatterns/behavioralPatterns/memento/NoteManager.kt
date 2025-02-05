package designPatterns.behavioralPatterns.memento

class NoteManager {
    private val mementos = mutableListOf<NoteMemento>()

    fun save(editor: NoteEditor) {
        mementos.add(editor.createMemento())
    }

    fun undo(editor: NoteEditor) {
        if (mementos.isNotEmpty()) {
            val memento = mementos.removeAt(mementos.size - 1)
            editor.restore(memento)
        }
    }
}
