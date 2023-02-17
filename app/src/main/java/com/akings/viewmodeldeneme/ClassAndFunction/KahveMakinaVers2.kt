package com.akings.viewmodeldeneme.ClassAndFunction

fun main() {
    makineDurum2()
}

fun makineDurum2() {

    println("Write action (buy, fill, take,remaining, exit): ")
    print("> ")

    val select = readln()
    when (select) {
        "buy" -> buy2()
        "fill" -> fill2()
        "take" -> take2()
    }

}

// Satın Al
fun buy2() {
    println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino,back - to main menu:")
    print("> ")
    val kahveCesit = readln()

    val water = 400
    val milk = 540
    val coffee = 120
    val cups = 9
    val money = 550
    when (kahveCesit) {
        "1" -> {
            val waterEsp = water - 250
            val coffeeEsp = coffee - 16
            val cupsEsp = cups - 1
            val moneyEsp = money + 4
            println("The coffee machine has:\n" +
                    "$waterEsp ml of water\n" +
                    "540 ml of milk\n" +
                    "$coffeeEsp g of coffee beans\n" +
                    "$cupsEsp disposable cups\n" +
                    "\$${moneyEsp} of money")
        }
        "2" -> {
            val waterLat = water - 350
            val milkLat = milk - 75
            val coffeeLat = coffee - 20
            val cupsLat = cups - 1
            val moneyLat = money + 7

            println("The coffee machine has:\n" +
                    "$waterLat ml of water\n" +
                    "$milkLat ml of milk\n" +
                    "$coffeeLat g of coffee beans\n" +
                    "$cupsLat disposable cups\n" +
                    "\$${moneyLat} of money")
        }
        "3" -> {
            val waterKap = water - 200
            val milkKap = milk - 100
            val coffeeKap = coffee - 12
            val cupsKap = cups - 1
            val moneyKap = money + 6


            println("The coffee machine has:\n" +
                    "$waterKap ml of water\n" +
                    "$milkKap ml of milk\n" +
                    "$coffeeKap g of coffee beans\n" +
                    "$cupsKap disposable cups\n" +
                    "\$${moneyKap} of money")
        }


    }


}

// Doldur
fun fill2() {
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

    println("The coffee machine has:\n" +
            "${400 + ekleWater} ml of water\n" +
            "${540 + ekleMilk} ml of milk\n" +
            "${120 + ekleCoffee} g of coffee beans\n" +
            "${9 + ekleCups} disposable cups\n" +
            "\$550 of money")
}

//Al
fun take2() {
    println("I gave you \$550")
    println("The coffee machine has:\n" +
            "400 ml of water\n" +
            "540 ml of milk\n" +
            "120 g of coffee beans\n" +
            "9 disposable cups\n" +
            "\$0 of money")

}
