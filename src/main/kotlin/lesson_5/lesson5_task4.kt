package org.example.lesson_5

const val REGISTERED_USERNAME = "Zaphod"
const val REGISTERED_PASSWORD = "PanGalactic"

fun main() {

    print("Имя пользователя: ")
    val inputName = readln()

    if (inputName == REGISTERED_USERNAME) {
        print("Пароль: ")
        val inputPassword = readln()

        if (inputPassword == REGISTERED_PASSWORD) {
            println("Пользователь $REGISTERED_USERNAME, вам разрешено входить на борт корабля.")
            println("Добро пожаловать на борт, $REGISTERED_USERNAME!")

        } else {
            println("Увы, пароль неверен. Доступ запрещён.")
        }
    } else {
        println("Похоже, вы не зарегистрированы в бортовой системе.")
        println("Если хотите — зарегистрируйтесь, но это конец этой программы. До свидания.")
    }


}