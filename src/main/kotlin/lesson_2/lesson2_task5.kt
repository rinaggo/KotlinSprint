package org.example.lesson_2

fun main(){

    val depositAmount = 70000
    val percent = 16.7
    val numberOfYears = 20

    val finalAmount = depositAmount * Math.pow(1 + percent / 100, numberOfYears.toDouble())

    println(String.format("%.3f", finalAmount))

}