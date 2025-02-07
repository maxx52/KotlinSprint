package ru.maxx52.lesson_11

//Скопируй класс User из первой задачи и назови User2.
// Добавь к классу новое необязательное свойство bio и несколько методов:
//- вывод информации о пользователе в консоль;
//- считывание из консоли текста и запись в поле bio;
//- изменение пароля — сначала запросить текущий пароль, и,
// если он введен верно, запросить новый. Записать его в поле и сообщить,
// что пароль изменен;
//Далее создай объект, заполни информацию “о себе” и замени пароль.
// В конце выведи обновленную информацию о пользователе.

fun main() {
    val newUser = User2(1, "guest", "123456", "guest@mail.com")

    newUser.readBioUser()
    newUser.changePassword()
    newUser.printUser()
}

class User2(
    private val id: Int,
    private val login: String,
    private var password: String,
    private val email: String,
    private var bio: String = ""
) {
    fun printUser() {
        println("Пользователь: id: $id, логин: $login, e-mail: $email, о себе: $bio")
    }

    fun readBioUser() {
        println("Расскажите немного о себе:")
        val bioInput = readln().trim()
        if (bioInput.isNotEmpty()) {
            bio = bioInput
        } else {
            notEmptyField()
        }
    }

    fun changePassword() {
        println("Для изменения пароля введите свой действующий пароль:")
        val passwordInput = readln().trim()

        if (passwordInput == password) {
            println("Введите новый пароль:")
            val newPassword = readln().trim()

            if (newPassword.isNotEmpty()) {
                password = newPassword
                println("Пароль успешно изменен!")
            } else {
                notEmptyField()
            }
        } else {
            println("Вы ввели неверный пароль!")
        }
    }

    private fun notEmptyField() {
        println("Данное поле не может быть пустым!")
    }
}