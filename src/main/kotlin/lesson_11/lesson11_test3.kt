package ru.maxx52.lesson_11

fun main() {
    val newRoom = Room("Цветная обложка", "Гостевая комната")

    val user1 = SimpleUser("Maxx", "avatar1.png")
    val user2 = SimpleUser("Nadya", "avatar2.png")

    newRoom.addUser(user1)
    newRoom.addUser(user2)

    newRoom.setUserStatus("Maxx", Status.USER_SPEAK)
    newRoom.setUserStatus("Nadya", Status.USER_MICROPHONE_OFF)

    newRoom.printUsers()
}

class Room(
    val cover: String = "Обложка по умолчанию",
    private val title: String,
    private var userList: MutableList<User1> = mutableListOf(),
) {

    fun addUser(user: User1) {
        userList.add(user)
        println("${user.nickName} добавлен в комнату \"$title\"")
    }

    fun printUsers() {
        println("Пользователи в комнате \"$title\": ")
        for (user in userList) {
            println("${user.nickName} (Статус: ${user.status.displayName})")
        }
    }

    fun setUserStatus(nickName: String, status: Status) {
        val user = userList.find { it.nickName == nickName }
        if (user != null) {
            user.status = status
            println("${user.nickName} статус изменён на: ${status.displayName}")
        } else {
            println("Пользователь с ником \"$nickName\" не найден.")
        }
    }
}

abstract class User1(val nickName: String, val avatar: String) {
    var status: Status = Status.USER_MUTED
}

class SimpleUser(nickName: String, avatar: String) : User1(nickName, avatar) {
    fun onLongPressed(): String {
        return avatar
    }
}

enum class Status(val displayName: String) {
    USER_SPEAK("разговаривает"),
    USER_MICROPHONE_OFF("микрофон выключен"),
    USER_MUTED("пользователь заглушен");
}