package com.akings.viewmodeldeneme.ClassAndFunction

class Dog(val name: String, val breed: String, val competitionsParticipated: List<String>) {

    init {
        for (comp in competitionsParticipated) {
            println("$name participated in $comp.")
        }
    }

    fun speak() {
        println("$name says:Woof!")
    }

    // Write your function below


}

fun getListOfNumbers(): List<Int> {
    val myList = mutableListOf<Int>()

    for (i in (1..7)) {
        println("Enter a year: ")
        val answer = Integer.valueOf(readLine().toString())
        myList.add(answer)

    }
    return myList

}

fun findMax(Ints: List<Int>): Int {
    var largestNumber = Ints[0]
    for (i in Ints) {
        if (i > largestNumber) {
            largestNumber = i
        }
    }
    return largestNumber
}

fun findMin(Ints: List<Int>): Int {
    var smallestNumber = Ints[0]
    for (i in Ints) {
        if (i < smallestNumber) {
            smallestNumber = i
        }
    }
    return smallestNumber
}

fun findAverage(Ints: List<Int>): Int {
    var sum = 0
    for (i in Ints) {
        sum += i
    }
    return sum / Ints.size

}

fun checkIfListContains(Ints: List<Int>, intArg: Int): Boolean {
    for (i in Ints) {
        if (i == intArg) {
            return true
        }
    }
    return false

}


fun main() {
    /*
    val maxie = Dog(
        "Maxie",
        "Poodle",
        listOf("Westminster Kennel Club Dog Show", "AKC National Championship"))
    maxie.speak()

    val values = getListOfNumbers()
    //println(values)
    val largestValue = findMax(values)
    println("The largest number is $largestValue")

    val smallestValue = findMin(values)
    println("The smallest number is $smallestValue")

    val average = findAverage(values)
    println("The average number is $average")

    println("Enter a number : ")
    val numToFind = Integer.valueOf(readLine().toString())
    val includeValue = checkIfListContains(values,numToFind)
    if (includeValue) {
        println("The number exists in the list.")
    } else {
        println("The number does not exist in the list.")
    }

     */
   // println("${Quiz.answered} of ${Quiz.total} answered.")
    //Quiz.printProgressBar() interface eklenince pasifleştirildi
   // Quiz().printProgressBar()
    var i = 0
    while (i < 10) {
        i++
        if (i % 2 == 0) {
            print("$i ")
        }
    }






}

enum class Difficulty {
    EASY, MEDIUM, HARD
}

data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty,
)

interface ProgressPrintable {
    val progressText: String
    fun printProgressBar()
}

class Quiz() : ProgressPrintable {

    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 =
        Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)

    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 4
    }

    override val progressText: String
        get() = "${answered} of ${total} answered"

    override fun printProgressBar() {
        repeat(Quiz.answered) { print("▓") }
        repeat(Quiz.total - Quiz.answered) { print("▒") }
        println()
        println(progressText)
    }
}

//interface ProgressPrintable interface'i eklenince bu aşağıdaki kodlar pasif hale getirdim
/*
fun Quiz.StudentProgress.printProgressBar() {
    repeat(Quiz.answered) { print("▓") }
    repeat(Quiz.total - Quiz.answered) { print("▒") }
    println()
    println(Quiz.progressText)
}
val Quiz.StudentProgress.progressText:String
    get() = "${answered} of ${total} answered"
 */





