package ru.maxx52.lesson_11

fun main() {
    val forum = Forum()

    val user1 = forum.createNewUser("Maxx")
    val user2 = forum.createNewUser("Влад")

    forum.createNewMessage(user1.userId, "Привет, как дела?")
    forum.createNewMessage(user1.userId, "Сегодня отличный день!")
    forum.createNewMessage(user2.userId, "Всё отлично, спасибо!")
    forum.createNewMessage(user2.userId, "Как научиться программировать?")

    forum.printThread()
}

class Forum {
    private val users = mutableListOf<UserForum>()
    private val messages = mutableListOf<MessageForum>()

    fun createNewUser(userName: String): UserForum {
        val newUser = UserForum(userName)
        users.add(newUser)
        return newUser
    }

    fun createNewMessage(authorId: String, messageText: String) {
        val message = MessageForum(authorId, messageText)
        messages.add(message)
    }

    fun printThread() {
        for (message in messages) {
            val author = users.find { it.userId == message.authorId }
            val authorName = author?.userName
            println("$authorName: ${message.message}")
        }
    }
}

class UserForum(
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

class MessageForum(
    val authorId: String,
    val message: String,
)

const val LENGTH_ID = 4