package ru.maxx52.lesson_11

// Чё-то я наворотил здесь наверное много лишнего ))

fun main() {
    val newRoom = Room("Цветная обложка", "Гостевая комната", "Maxx", "smile")

    val user1 = SimpleUser("Maxx", "avatar1.png")
    val user2 = SimpleUser("Nadya", "avatar2.png")

    newRoom.addUser(user1)
    newRoom.addUser(user2)

    newRoom.printUsers()
}

class Room(
    val cover: String = "Обложка по умолчанию",
    private val title: String,
    private val nickName: String,
    private val avatar: String,
    private var userList: MutableList<User> = mutableListOf(),
    private val status: List<String> = listOf(USER_SPEAK, USER_MICROPHONE_OFF, USER_MUTED),
) {

    fun addUser(user: User) {
        userList.add(user)
        println("${user.nickName} добавлен в комнату \"$title\"")
    }

    fun printUsers() {
        println("Пользователи в комнате \"$title\": ${userList.joinToString { it.nickName }}")
    }
}

abstract class User(val nickName: String, val avatar: String)

class SimpleUser(nickName: String, avatar: String) : User(nickName, avatar) {
    fun newUserStatus(status: List<String>): String {
        return status.random()
    }

    fun longAvatarPressed(): String {
        return avatar
    }
}
const val USER_SPEAK = "разговаривает"
const val USER_MICROPHONE_OFF = "микрофон выключен"
const val USER_MUTED = "пользователь заглушен"