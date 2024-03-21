fun main() {
    // Page 9
    println("Hello, This is Busra.")
    println("And this is a practise of Kotlin Lang.")

    // Page 10
    sumOfTwoDigits(12,7)

    // Page 11
    val pi = 3.14
    val radius = 1
    var lengthOfCircle = 0.0
    lengthOfCircle = 2 * pi * radius
    println("Length of a circle with radius $radius is $lengthOfCircle.")

    // Page 12
    println("The radius is 1 and height is 5. Volume of the cylinder is, ${Cylinder(1,5).volumeOfCylinder}.")

    // Page 14
    var number = 1
    val str = "Number is $number"
    number = 2
    val str2 = "${str.replace("is", "was")}, but now is $number"
    println(str2)

    // Page 15
    fun maxOfTwo(first: Int, second: Int) : Int {
        if (first > second) {
            return first
        } else {
            return second
        }
    }
    fun maxOf(first: Int, second: Int) = if (first > second) first else second

    // Page 16
    val items = listOf("Daisy", "Rose", "Orchid")
    for (item in items) {
        println(item)
    }
    for (index in items.indices) {
        println("The item at $index is ${items[index]}.")
    }

    // Page 17
    var index = 0
    while (index < items.size) {
        println("The item at $index is ${items[index]}.")
        index++
    }

    // Page 18
    println(pickFlower("It doesn't matter"))

    // Page 19
    val a = 6
    val b = 5
    if (a in 1..b+1) {
        println("It fits!")
    }

    val myList = listOf("b","u","s","r","a")
    if (-1 !in 0..myList.lastIndex) {
        println("It doesn't fit!")
    }

    if (myList.size !in myList.indices) {
        println("List size is out of valid list indices range")
    }

    for (a in 1..5) {
        println(a)
    }

    for (a in 1..10 step 2) {
        println(a)
    }

    for (a in 9 downTo 0 step 3) {
        println(a)
    }

    // Page 20
    items.filter { it.startsWith("D") }
        .map { it.uppercase() }
        .forEach{ println(it) }

    // Page 21
    var d: String? = "Daisy"
    if(d == null) {
        println("The variable is null")
    }

    // Page 22
    if(d is String) {
        println(d.length)
    }

    if (d is String && d.length > 0) {
        println(d.length)
    }

    if (d !is String) {
        d = null
    }

    // Page 23
    // Class name, Object name: StudentInformation.kt
    // Package name: org.ba.students
    // Long package name: org.ba.studentsInformations
    // Variables, functions etc. : studentInformation()
    // Test1: @Test fun 'student info correction'() {}
    // Test2: @Test fun studentInfoCorrection_onAndroid() {}
    // Constants: const val MAX_VALUE = 123
    // Collections: mutableCollection: MutableSet<String> = HashSet()
    // Order of the modifiers:
    // 1- public / protected / private / internal
    // 2- expect / actual
    // 3- final / open / abstract / sealed / const
    // 4- external
    // 5- override
    // 6- lateinit
    // 7- tailrec
    // 8- vararg
    // 9- suspend
    // 10- inner
    // 11- enum / annotation / fun
    // 12- companion
    // 13- inline
    // 14- infix
    // 15- operator
    // 16- data
    // File annotations write before package name

    // Page 38
    helloFriend("BA")
    helloFriend()

    // Page 39
    val flowerD = items.filter { x -> x.startsWith("D") }
    println(flowerD)
    val flowerO = items.filter { it.startsWith("O") }
    println(flowerO)

    // Page 40
    if ("Orchid" in items) {
        println("There is Orchid!")
    }
    if ("Lily" !in items) {
        println("There is no Lily!")
    }


}

fun sumOfTwoDigits(firstNumber: Int, secondNumber: Int) = println("Sum of two digits is ${firstNumber + secondNumber}.")

// Page 12
open class Volume()
class Cylinder (val radius: Int, val h: Int) : Volume() {
    val volumeOfCylinder = 3.14 * radius * radius * h
}

// Page 18
fun pickFlower(obj: Any): String =
    when (obj) {
        1 -> "You should pick Daisy"
        "It doesn't matter" -> "You should pick Rose"
        is Long -> "You should pick Orchid"
        !is String -> "You should pick Daisy"
        "Idk" -> "You should pick Rose"
        else -> "You should pick Orchid"
    }

fun helloFriend(
    name: String = "Busra",
    say: String = "Hello"
) {
    println("$say Friend! This is $name")
}
