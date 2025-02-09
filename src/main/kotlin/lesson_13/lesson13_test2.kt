package ru.maxx52.lesson_13

fun main() {

    val contact1 = Contact1("Alex", 89008007007)
    val contact2 = Contact1("Yana", 89091234567, "Reddit")
    contact1.printContact()
    contact2.printContact()
}

class Contact1(
    private val name: String,
    private val phone: Long,
    private val company: String? = null
) {
    fun printContact(){
        println("- Имя: $name\n- номер телефона: $phone\n- компания: ${company ?: "не указана"}")
    }
}