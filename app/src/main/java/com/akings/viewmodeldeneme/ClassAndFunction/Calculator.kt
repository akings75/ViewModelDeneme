package com.akings.viewmodeldeneme.ClassAndFunction

class Calculator(val name:String) {

    init {
        println("$name's Calculator 🧮")
    }

    fun add(num1:Int,num2:Int) : Int {
        return num1 + num2

    }

    fun subtract(num1:Int,num2:Int) : Int {
        return num1 - num2

    }

    fun multiple(num1:Int,num2:Int) : Int {
        return num1 * num2

    }

    fun divide(num1:Int,num2:Int) : Any {
        return if (num2!=0) {
            num1 / num2
        } else {
            "Error! Dividing by zero is not allowed."
        }
    }

    fun power(num1:Int,num2:Int) : Int {
        var result = 1
        for (i in (1..num2)) {
            result*=num1
        }
        return result

    }

}



fun main() {
    val hesap = Calculator("Codey")
    println( hesap.add(3,5))
    println( hesap.subtract(3,5))
    println( hesap.multiple(3,5))
    println( hesap.divide(30,5))
    println( hesap.power(3,5))




}