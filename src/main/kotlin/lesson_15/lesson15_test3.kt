package ru.maxx52.lesson_15

const val LENGTH_ID = 4

fun main() {
    val forum = Forum2()

    val user1 = forum.createNewUser("Maxx") as Guest2
    val user2 = forum.createNewUser("Влад") as Guest2
    val admin = forum.createNewAdmin("Admin")

    forum.createNewMessage(user1.userId, "Привет, как дела?")
    forum.createNewMessage(user1.userId, "Сегодня отличный день!")
    forum.createNewMessage(user2.userId, "Всё отлично, спасибо!")
    forum.createNewMessage(user2.userId, "Всем привет))")

    forum.printThread()
    forum.deleteMessage(admin.userId, 1)
    forum.printThread()

    forum.deleteUser(admin.userId, user1.userId)
    forum.printThread()
}

class Forum2 {
    private val users = mutableListOf<UserForum2>()
    private val messages = mutableListOf<MessageForum2>()

    fun createNewUser(userName: String): UserForum2 {
        val newUser = Guest2(userName)
        users.add(newUser)
        return newUser
    }

    fun createNewAdmin(userName: String): UserForum2 {
        val newAdmin = Admin2(userName)
        users.add(newAdmin)
        return newAdmin
    }

    fun createNewMessage(authorId: String, messageText: String) {
        val message = MessageForum2(authorId, messageText)
        messages.add(message)
    }

    fun deleteMessage(adminId: String, messageIndex: Int) {
        if (users.any { it.userId == adminId && it is Admin2 }) {
            if (messageIndex in messages.indices) {
                val message = messages.removeAt(messageIndex)
                println("Администратор удалил сообщение: '${message.message}'")
            } else {
                println("Сообщение не найдено")
            }
        } else {
            println("Только администратор может удалять сообщения.")
        }
    }

    fun deleteUser(adminId: String, userId: String) {
        if (users.any { it.userId == adminId && it is Admin2 }) {
            val userRemove = users.find { it.userId == userId }
            if (userRemove != null) {
                users.remove(userRemove)
                println("Администратор удалил пользователя: ${userRemove.userName}")
            } else {
                println("Ошибка: Пользователь не найден.")
            }
        } else {
            println("Ошибка: Только администратор может удалять пользователей.")
        }
    }

    fun printThread() {
        for (message in messages) {
            val author = users.find { it.userId == message.authorId }
            val authorName = author?.userName ?: "Удалённый автор"
            println("$authorName: ${message.message}")
        }
    }
}

abstract class UserForum2(
    val userName: String,
) {
    val userId: String = generateId()

    private fun generateId(): String {
        val numbers = ('0'..'9') + ('a'..'z')
        return (1..LENGTH_ID)
            .map { numbers.random() }
            .joinToString("")
    }
}

class Guest2(userName: String) : UserForum2(userName)

class Admin2(userName: String) : UserForum2(userName)

class MessageForum2(
    val authorId: String,
    val message: String,
)