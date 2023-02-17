package com.akings.viewmodeldeneme.ClassAndFunction

class CoffeeMaker(
    private var water: Int = 400,
    private var milk: Int = 540,
    private var coffee: Int = 120,
    private var cups: Int = 9,
    private var money: Int = 550,
) {

    // Satın Al
    fun buy() {
        println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino,back - to main menu:")
        print("> ")

        val kahveCesit = readln()
        when (kahveCesit) {
            "1" -> {
                if (water > 249 && coffee > 15 && cups > 0) {
                    water -= 250
                    coffee -= 16
                    cups -= 1
                    money += 4

                    println("I have enough resources, making you a coffee!") // Sana kahve yapmak için yeterince kaynağım var!
                } else {
                    println("Sorry, not enough water!") // Üzgünüm, yeterli su yok!
                }

            }
            "2" -> {
                if (water > 349 && milk > 74 && coffee > 19 && cups > 0) {
                    water -= 350
                    milk -= 75
                    coffee -= 20
                    cups -= 1
                    money += 7

                    println("I have enough resources, making you a coffee!") // Sana kahve yapmak için yeterince kaynağım var!
                } else {
                    println("Sorry, not enough water!") // Üzgünüm, yeterli su yok!
                }

            }
            "3" -> {
                if (water > 249 && milk > 99 && coffee > 15 && cups > 0) {
                    water -= 200
                    milk -= 100
                    coffee -= 12
                    cups -= 1
                    money += 6

                    println("I have enough resources, making you a coffee!") // Sana kahve yapmak için yeterince kaynağım var!
                } else {
                    println("Sorry, not enough water!") // Üzgünüm, yeterli su yok!
                }

            }
            "back" -> {

            }

        }


    }

    // Doldur
    fun fill() {
        println("Write how many ml of water you want to add:")
        print("> ")
        val ekleWater = readln().toInt()
        println("Write how many ml of milk you want to add:")
        print("> ")
        val ekleMilk = readln().toInt()
        println("Write how many grams of coffee beans you want to add:")
        print("> ")
        val ekleCoffee = readln().toInt()
        println("Write how many disposable cups you want to add:")
        print("> ")
        val ekleCups = readln().toInt()
        water += ekleWater
        milk += ekleMilk
        coffee += ekleCoffee
        cups += ekleCups
    }

    //Al
    fun take() {
        println("I gave you \$$money")
        money = 0


    }

    //geriye kalan
    fun remaining() {
        println("The coffee machine has:\n" +
                "$water ml of water\n" +
                "$milk ml of milk\n" +
                "$coffee g of coffee beans\n" +
                "$cups disposable cups\n" +
                "\$$money of money")

    }

    //ÇIKIŞ
    fun cikis() {

    }


}

fun main() {
    val coffeeMaker = CoffeeMaker()
    while (true) {
        println("Write action (buy, fill, take,remaining, exit): ")
        print("> ")
        when (readln()) {
            "buy" -> coffeeMaker.buy()
            "fill" -> coffeeMaker.fill()
            "take" -> coffeeMaker.take()
            "remaining" -> coffeeMaker.remaining()
            "exit" -> break
        }
    }


}