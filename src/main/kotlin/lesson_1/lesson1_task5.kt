package org.example.lesson_1

const val MINUTES_IN_HOUR = 60
const val SECONDS_IN_MINUTE = 60

fun main(){

    val allSecond = 6480
    val minute = (allSecond / SECONDS_IN_MINUTE) % MINUTES_IN_HOUR
    val hour = allSecond / (MINUTES_IN_HOUR * SECONDS_IN_MINUTE)
    val second = allSecond % SECONDS_IN_MINUTE

   println(String.format("%02d:%02d:%02d", hour, minute, second))
}