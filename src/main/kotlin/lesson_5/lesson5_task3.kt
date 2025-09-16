package org.example.lesson_5

fun main() {

    val firstCorrectAnswer = 19
    val secondCorrectAnswer = 26

    println("Приложение-лотерея, нужно угадать два числа от 0 до 42.")
    print("Введите первое число: ")
    val firstAnswer = readln().toInt()

    print("Введите второе число: ")
    val secondAnswer = readln().toInt()

    if ((firstAnswer == firstCorrectAnswer && secondAnswer == secondCorrectAnswer) ||
        (firstAnswer == secondCorrectAnswer && secondAnswer == firstCorrectAnswer)) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (firstAnswer == firstCorrectAnswer || firstAnswer == secondCorrectAnswer ||
        secondAnswer == firstCorrectAnswer || secondAnswer == secondCorrectAnswer) {
        println("Вы выиграли утешительный приз!")
        println("Для победы были нужны числа $firstCorrectAnswer и $secondCorrectAnswer")
    } else {
        println("Неудача!")
        println("Для победы были нужны числа $firstCorrectAnswer и $secondCorrectAnswer")
    }
}