package org.example.lesson_2

fun main(){

    val staffCount = 50
    val staffSalary = 30000
    val internCount = 30
    val internSalary = 20000

    val staffExpenses = staffCount * staffSalary
    val allExpenses = staffExpenses + internCount * internSalary
    val averageSalary = allExpenses/(staffCount + internCount)

    println(staffExpenses)
    println(allExpenses)
    println(averageSalary)
}