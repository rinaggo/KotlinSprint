package org.example.lesson_1

const val MINUTES_IN_HOUR = 60
const val SECONDS_IN_MINUTE = 60

fun main(){

    val allSecond = 6480
    val minute = (allSecond / SECONDS_IN_MINUTE) % MINUTES_IN_HOUR
    val hour = allSecond / (MINUTES_IN_HOUR * SECONDS_IN_MINUTE)
    val second = allSecond % SECONDS_IN_MINUTE

    if (hour < 10 && second < 10) {
        println("0$hour:$minute:0$second")
    } else if (hour > 9 && second < 10)  {
        println("$hour:$minute:0$second")
    } else if (second > 9 && hour < 10) {
        println("0$hour:$minute:$second")
    } else {
        println("$hour:$minute:$second")
    }
}