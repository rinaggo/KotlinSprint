package org.example.lesson_5

const val CENTIMETRE_IN_METRE = 100.0

fun main() {

    print("Введите свой вес в кг: ")
    val weight = readln().toDouble()

    print("Введите свой рост: ")
    val heightCm = readln().toDouble()

    val heightM = heightCm / CENTIMETRE_IN_METRE
    val bmi = weight / (heightM * heightM)

    if (bmi < 18.5) {
        println("Ваш ИМТ: ${String.format("%.2f", bmi)} - Недостаточная масса тела")
    } else if (bmi >= 18.5 && bmi < 25) {
        println("Ваш ИМТ: ${String.format("%.2f", bmi)} - Нормальная масса тела")
    } else if (bmi >= 25 && bmi < 30) {
        println("Ваш ИМТ: ${String.format("%.2f", bmi)} -Избыточная масса тела")
    } else {
        println("Ваш ИМТ: ${String.format("%.2f", bmi)} - Ожирение")
    }

}