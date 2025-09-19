package org.example.lesson_5

import kotlin.random.Random

fun main() {

    println("Приложение-лотерея. нужно угадать три числа от 0 до 42")
    val hiddenNumbers = mutableListOf<Int>()

    for (i in 1..3) {
        hiddenNumbers.add(Random.nextInt(0,43))
    }

    val inputNumbers = mutableListOf<Int>()

    print("Введите первое число: ")
    val firstNumber = readln().toInt()
    inputNumbers.add(firstNumber)

    print("Введите второе число: ")
    val secondNumber = readln().toInt()
    inputNumbers.add(secondNumber)

    print("Введите третье число: ")
    val thirdNumber = readln().toInt()
    inputNumbers.add(thirdNumber)

    val matchedCount = hiddenNumbers.intersect(inputNumbers).size

    when (matchedCount) {
        3 -> println("Вы угадали все числа и выиграли джекпот")
        2 -> println("Вы угадали два числа и выиграл крупный приз")
        1 -> println("Вы угадали одно число и выиграли утешительный приз")
        0 -> println("Вы не угадали ни одного числа")
    }

    println("Загаданные числа: ${hiddenNumbers[0]}, ${hiddenNumbers[1]}, ${hiddenNumbers[2]}")
}