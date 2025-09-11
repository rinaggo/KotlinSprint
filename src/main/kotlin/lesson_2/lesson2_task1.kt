package org.example.lesson_2

fun main(){

    val firstValue = 3
    val secondValue = 4
    val thirdValue = 3
    val fourthValue = 5
    val studentCount = 4

    val averageValue: Double = (firstValue + secondValue + thirdValue + fourthValue).toDouble()/studentCount

    println(averageValue)
}