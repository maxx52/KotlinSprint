package ru.maxx52.lesson_14

fun main() {
    val chat = Chat()

    chat.addMessage("Привет, как дела?", "Elena")
    chat.addMessage("Всё отлично, спасибо!", "Michael")

    chat.addThreadMessage(1, "Что нового?", "Anton")
    chat.addThreadMessage(1, "Как погода?", "David")

    chat.printChat()
}

class Chat {
    private val listMessage = mutableListOf<Message>()
    private var messageIdCounter = 1

    fun addMessage(text: String, author: String) {
        val message = Message(messageIdCounter++, text, author)
        listMessage.add(message)
    }

    fun addThreadMessage(parentMessageId: Int, text: String, author: String) {
        val childMessage = ChildMessage(messageIdCounter++, text, author, parentMessageId)
        listMessage.add(childMessage)
    }

    fun printChat() {
        val groupedMessages = listMessage.groupBy { it.parentMessageId ?: it.id }
        for ((_, messages) in groupedMessages) {
            for (message in messages) {
                message.printMessage(0)
            }
        }
    }
}

open class Message(
    val id: Int,
    private val text: String,
    private val author: String,
    val parentMessageId: Int? = null
) {
    open fun printMessage(indent: Int) {
        println("${"\t".repeat(indent)}Сообщение от $author (ID: $id): $text")
    }
}

class ChildMessage(
    id: Int,
    text: String,
    author: String,
    parentMessageId: Int
) : Message(id, text, author, parentMessageId) {
    override fun printMessage(indent: Int) {
        super.printMessage(indent + 1)
    }
}