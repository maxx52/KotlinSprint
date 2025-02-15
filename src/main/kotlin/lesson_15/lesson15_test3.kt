package ru.maxx52.lesson_15

const val LENGTH_ID = 4

fun main() {
    val user1 = Guest2("Maxx")
    val user2 = Guest2("Влад")
    val admin = Admin2("Admin")

    admin.createMessage("Привет, как дела?")
    user1.createMessage("Всё отлично, спасибо!")
    user2.createMessage("Всем привет))")
    user2.createMessage("Сегодня отличный день!")

    admin.displayMessages()

    admin.deleteMessage(1)
    admin.displayMessages()

    admin.deleteUser(user1.userId)
}

abstract class UserForum2 {
    val userId: String = generateId()
    abstract val userName: String

    private fun generateId(): String {
        val characters = ('0'..'9') + ('a'..'z')
        return (1..LENGTH_ID)
            .map { characters.random() }
            .joinToString("")
    }

    abstract fun createMessage(messageText: String)
    abstract fun displayMessages()
}

class Guest2(override val userName: String) : UserForum2() {
    private val messages = mutableListOf<String>()

    override fun createMessage(messageText: String) {
        messages.add("$userName: $messageText")
        println("Пользователь $userName добавил сообщение: '$messageText'")
    }

    override fun displayMessages() {
        for (message in messages) {
            println(message)
        }
    }
}

class Admin2(override val userName: String) : UserForum2() {
    private val messages = mutableListOf<String>()
    private val users = mutableListOf<Guest2>()

    override fun createMessage(messageText: String) {
        messages.add("$userName: $messageText")
        println("Администратор $userName добавил сообщение: '$messageText'")
    }

    fun deleteMessage(index: Int) {
        if (index in messages.indices) {
            val removedMessage = messages.removeAt(index)
            println("Администратор $userName удалил сообщение: '$removedMessage'")
        } else {
            println("Сообщение с индексом $index не найдено.")
        }
    }

    fun deleteUser(userId: String) {
        users.removeIf { it.userId == userId }
        println("Администратор $userName удалил пользователя с ID: $userId.")
    }

    override fun displayMessages() {
        println("--- Сообщения на форуме ---")
        for (message in messages) {
            println(message)
        }
    }
}