package designPatterns.behavioralPatterns.memento

fun main() {
    val editor = NoteEditor()
    val noteManager = NoteManager()

    editor.content = "O peito do pé de Pedro é preto. " +
            "Quem disser que o peito do pé de Pedro é preto, " +
            "tem o peito do pé mais preto do que o peito do pé de Pedro"

    noteManager.save(editor)

    editor.content = "O Tempo perguntou ao tempo quanto tempo o tempo tem, " +
            "o Tempo respondeu ao tempo que o tempo tem tanto tempo quanto tempo, tempo tem"
    noteManager.save(editor)

    editor.content = "Embaixo da pia tem um pinto que pia, quanto mais a pia pinga mais o pinto pia!"

    println(editor.content)

    noteManager.undo(editor)

    println(editor.content)

    noteManager.undo(editor)

    println(editor.content)
}
