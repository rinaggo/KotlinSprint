package org.example.lesson_2

fun main(){

    val buff = 0.2
    val crystalOre = 7
    val ironOre = 11

    val countBuffCrystal = (crystalOre * buff).toInt()
    val countBuffIron = (ironOre * buff).toInt()

    println(countBuffCrystal)
    println(countBuffIron)
}