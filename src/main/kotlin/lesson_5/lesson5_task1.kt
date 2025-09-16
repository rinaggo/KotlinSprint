package org.example.lesson_5


fun main() {

    val firstNumber = 14
    val secondNumber = 18
    val correctAnswer = firstNumber + secondNumber

    println("Подтвердите, что вы не робот")
    print("Решите пример $firstNumber + $secondNumber = ")

    val answer = readln().toInt()

    val greetingMessage = "Добро пожаловать!"
    val incorrectAnswer = "Доступ запрещен."

    if (answer == correctAnswer) {
        println(greetingMessage)
    } else {
        println(incorrectAnswer)
    }

}