package ru.maxx52.lesson_13

fun main() {
    val contactList = mutableListOf<Contact3>()

    println("Введите имя контакта:")
    val name = readln()

    var phone: Long? = null
    try {
        println("Введите номер телефона:")
        val phoneInput = readln()
        phone = phoneInput.toLong()
    } catch (e: NumberFormatException) {
        println("Возникла ошибка: $e")
        return
    }

    println("Введите название компании:")
    val companyInput = readln()

    val contact = Contact3(name, phone, companyInput.ifBlank { null })
    contactList.add(contact)

    println("\nСозданные контакты:")
    for (contacts in contactList) {
        contacts.printContact()
    }
}

class Contact3(
    private val name: String,
    private val phone: Long? = null,
    val company: String? = null
) {
    fun printContact() {
        println("- Имя: $name\n- Номер телефона: $phone\n- Компания: ${company ?: "не указана"}")
    }
}