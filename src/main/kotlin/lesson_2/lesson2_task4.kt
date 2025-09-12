package org.example.lesson_2

fun main(){

    val buffPercent = 20
    val crystalOre = 7
    val ironOre = 11

    val countBuffCrystal: Int = (crystalOre * buffPercent / 100)
    val countBuffIron: Int = (ironOre * buffPercent / 100)

    println(countBuffCrystal)
    println(countBuffIron)
}