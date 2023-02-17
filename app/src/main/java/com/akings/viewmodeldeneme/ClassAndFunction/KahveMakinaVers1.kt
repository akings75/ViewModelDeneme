package com.akings.viewmodeldeneme.ClassAndFunction

fun eski() {
    println("Kahve makinesinde kaç ml su olduğunu yazınız:")
    val water = readLine().toString().toInt()
    println("Kahve makinesinde kaç ml süt olduğunu yazınız:")
    val milk = readLine().toString().toInt()
    println("Kahve makinesinde kaç gram kahve çekirdeği olduğunu yazınız:")
    val coffee = readLine().toString().toInt()
    println("Kaç fincan kahveye ihtiyacınız olacağını yazın:")
    val cupsOfCoffee = readLine().toString().toInt()
    val cupwater = water / 200
    val cupmilk = milk / 50
    val cupcoffee = coffee / 15
    val list = listOf(cupwater, cupmilk, cupcoffee)

    var num = list[0]
    for (i in list) {
        if (num > i) num = i
    }
    if (num > cupsOfCoffee) {
        println("Evet, o kadar kahve yapabilirim (hatta ${num - cupsOfCoffee} tane daha fazla)")
    } else if (num == cupsOfCoffee) {
        println("Evet, o kadar kahve yapabilirim")
    } else {
        println("Hayır, yalnızca ${num} fincan kahve yapabilirim")
    }
}