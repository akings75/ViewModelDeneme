package com.akings.viewmodeldeneme.ClassAndFunction

class Client {
    val name = "Unknown"
        get() = field
}

fun main() {
    val cli = Client()
    println(cli.name)
}

