package ru.maxx52.lesson_17

fun main() {
    val secretFolder = Folders("Main", 8, true)
    val normalFolder = Folders()

    secretFolder.name = "Shared"
    println(secretFolder.toString())

    normalFolder.name = "Pictures"
    println(normalFolder.toString())
}

class Folders(
    private val _name: String = "Documents",
    private var _volume: Int = 1,
    private var isSecret: Boolean = false,
) {
    var name: String = "Documents"
        get() {
            return if (isSecret) {
                "Скрытая"
            } else {
                _name
            }
        }
        set(value) {
            field = "Имя папки изменить нельзя!"
        }

    private val volume: Int
        get() {
            return if (isSecret) {
                0
            } else {
                _volume
            }
        }

    override fun toString(): String {
        return "Папка $name, содержит $volume файлов, скрытая? - $isSecret"
    }
}