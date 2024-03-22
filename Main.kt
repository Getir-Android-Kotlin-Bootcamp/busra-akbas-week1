import java.io.File
import java.util.Locale

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

    // Page 42 - Page 43
    val friendList = listOf("Enes", "Mehmet", "Demet")
    val friendMap = mapOf("Enes" to 1, "Mehmet" to 2, "Demet" to 3)
    println(friendMap)

    // Page 44
    for ((k,v) in friendMap) {
        println("$k -> $v")
    }

    // Page 45
    val lazyStudentInfo: String by lazy {
        println("First time printed value")
        "Demet is the lazy student"
    }
    println(lazyStudentInfo)
    println(" ")
    println(lazyStudentInfo)

    // Page 46
    fun String.toUpperCaseExt(): String {
        return this.uppercase()
    }
    println("busraakbas".toUpperCaseExt())

    // Page 47
    Television.findProgram()
    Television.watch()

    // Page 48
    val watchList = Classics()
    watchList.scarface()

    // Page 49
    val files = File("Test").listFiles()
    println(files?.size)

    // Page 50
    println(files?.size ?: "empty")

    val sizeOfFile = files?.size ?: run {
        val sizeOfThis = getSeven()
        sizeOfThis * 2
    }
    println(sizeOfFile)

    // Page 51
    val nameOfFriend = friendMap["Merve"] ?: println("There is no Merve in this MapList")

    // Page 52
    val myFriends = listOf<String>("Mehmet", "Ayla", "Enes", "Merve")
    val isThatMyFriend = myFriends.firstOrNull() ?: println("Not my friend!")

    // Page 53
    val value = "BUSRA"
    value?.let {
        "No, I don't want to share my informations."
    }

    // Page 54
    val name: String? = "Busra"
    val mapped = name?.let {
        println("Name area is not null and name is $it")
        it.length
    } ?: 0
    println(mapped)

    // Page 55
    println(intToColor(3))

    // Page 56
    println(crypted("BUSRA"))

    // Page 58
    val ba = if (a == 1) {
        "one"
    } else if(a == 3) {
        "three"
    } else if (a == 6) {
        "six"
    } else {
        "No Number"
    }
    println(ba)

    // Page 59
    println(arrayOfMilyons(6).contentToString())

    // Page 60
    println(getSeventeen())
    println(getSeventeen2())

    // Page 61 - Page 62
    val myDog = Dog()
    with(myDog) {
        bark()
        playWithKitties()
    }

    val myCuteDog = Dog().apply {
        ears = "Short"
        hasLittleNose = true
    }

    // Page 64
    println(genericFunction("Generic"))

    // Page 66
    fun myLittlePony(): String = TODO("take a feedback")

    // Page 67
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix = "Log", s = "Hello")

    // Page 68
    println("First infix fun: 3 shl 7 = " + (3 shl 7))
    println("Second infix fun: 4 shr 3 = " + (7 shr 11))

    // Page 70
    greetings("Hi", "Hello", "Hola", "Merhaba", "Essalamun Aleykum", "Salut")

    // Page 72
    var aNewVariable: String? = "This is a great coincident"
    aNewVariable = null

    // Page 73
    println(description("majezik"))

    // Page 74
    val customer = Customer()
    val contact = Contact(1, "This is a customer")
    println(contact.id)
    contact.sign = "I am a manager in this place"
    println(contact.sign)

    // Page 76
    val shopify = myMutableStack(3.7, 2.2, 3, 2.1)
    println("Should I buy it = $shopify")

    // Page 77
    val cylinderPipe = CylinderPipe(1,3)
    cylinderPipe.calculation()

    // Page 79
    val aCat = Cats(4, 2, "Fluffy")
    aCat.writeTheInfo()

    // Page 82
    val cookies = mutableListOf("Chocolate chip", "Nut", "Cacoa", "Coffee", "Coconut")
    for (cookie in cookies) {
        println("Great!! There is $cookie cookie.")
    }

    // Page 83
    while (cookies.size < 5) {
        println("There is still ${cookies.size} cookie here.")
        cookies.removeAt(cookies.size - 1)
    }

    // Page 84
    val cookiess = mutableListOf("Chocolate chip", "Nut", "Cacoa", "Coffee", "Coconut")
    var newCookies = 0
    while (cookiess.size <= 5 && cookiess.size != 0) {
        cookiess.removeAt(cookiess.size - 1)
        newCookies ++
        println("We need to bake $newCookies new cookies.")
    }
    /*do {
        if(cookiess.size != 0) {
            cookiess.removeAt(cookiess.size - 1)
            newCookies ++
        }
    } while (cookiess.size < newCookies)*/

    // Page 85
    for (i in 1..12) {
        print(i)
    }
    println("")
    for (i in 9 downTo 0 step 3) {
        print(i)
    }
    println("")
    for (i in 2..12 step 4) {
        print(i)
    }

    println("")
    // PAGE 86
    for(g in 'a'..'v') {
        print(g)
    }
    println("")

    // PAGE 87
    val myValue = 2
    if (myValue in 1..9) {
        println("The value is in range from 1 to 9.")
    }
    println("")
    val myOtherValue = 12
    if (myOtherValue !in 1..9) {
        println("The value is in range from 1 to 9.")
    }
    println("")

    // PAGE 88
    println(a == b)
    println(a == myValue)
    println(b == radius)

    val z = a
    println(a === z)

    // PAGE 89
    println(findMinValue(-12, 22))

    // PAGE 91
    val firstBook = MyBooks("Crime and Punishment ", "Fyodor Dostoevsky", 1866)
    val secondBook = MyBooks("Crime and Punishment ", "Fyodor Dostoevsky", 1866)
    println("equals(): ${firstBook.equals(secondBook)}")

    println("hashCode() - firstBook: ${firstBook.hashCode()}")
    println("hashCode() - secondBook: ${secondBook.hashCode()}")

    println("toString(): - firstBook: $firstBook")
    println("toString(): - secondBook: $secondBook")

    val copyBook = firstBook.copy(publishedDate = 1867)
    println("copy() - Copied Book: $copyBook")
    
}



fun sumOfTwoDigits(firstNumber: Int, secondNumber: Int) = println("Sum of two digits is ${firstNumber + secondNumber}.")

// Page 12
open class Volume()
class Cylinder (val radius: Int, val h: Int) : Volume() {
    val volumeOfCylinder = 3.14 * radius * radius * h
}

// Page 18 - Page 80 - Page 81
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

// Page 47
object Television{
    init{
        println("Television is initialized.")
    }

    fun findProgram(){
        println("Zap all channels.")
    }

    fun watch(){
        println("Stop when you find.")
    }
}

// Page 48
abstract class Movies {
    abstract fun scarface()
}

class Classics() : Movies() {
    override fun scarface() {
        println("I will watch this movie on september.")
    }

}

// Page 50
fun getSeven() = 7

// Page 55
fun intToColor(value: Int): String {
    return when(value) {
        1 -> "Red"
        2 -> "Yellow"
        3 -> "Blue"
        4 -> "Green"
        else -> "There is no such a color!"
    }
}

// Page 56
fun crypted(word: String): String {
    val result = StringBuilder()
    try {
        for (char in word) {
            when (char) {
                in 'a'..'y', in 'A'..'Y' -> result.append(char + 1)
                'z' -> result.append('a')
                'Z' -> result.append('A')
                else -> throw IllegalArgumentException("Its not a word!")
            }
        }
    } catch (e: IllegalArgumentException) {
        return e.message.toString()
    }

    return result.toString()
}

// Page 59
fun arrayOfMilyons(size: Int) : IntArray = IntArray(size).apply { fill(1000000) }

// Page 60
fun getSeventeen(): Int {
    return 17
}
fun getSeventeen2() = 17

// Page 61
class Dog() {
    var hasLittleNose = false
    var ears = "Long"
    fun bark() {}
    fun playWithKitties() {}
    fun wishCookies() {}
}

// Page 64
inline fun <reified T> genericFunction(value: T) {
    val typeName = T::class.simpleName
    println("The type of the name is $typeName")
}

// Page 67
fun printMessageWithPrefix(s: String, prefix: String = "Info") {
    println("$prefix : $s" )
}

// Page 70
fun greetings(vararg messages: String) {
    for (m in messages) println(m)
}

// Page 73
fun description(medicineName: String?): String {
    return when(medicineName) {
        "arveles" -> "pain killer"
        "majezik" -> "pain killer"
        "parol" -> "antipyretic"
        null -> "Not a medicine"
        else -> ""
    }
}

// Page 74
class Customer()

class Contact(val id: Int, var sign: String)

// Page 75
class MutableStack<I>(vararg items: I) {
    private val item = items.toMutableList()
    fun addItem(items: I) = item.add(items)
    fun deleteTheItem(): I = item.removeAt(item.size - 1)
    fun isEmpty() = item.isEmpty()
    fun size() = item.size
    
}

// Page 76
fun <I> myMutableStack(vararg item: I) = MutableStack(*item)

open class CalculatedVolume() {
    open fun calculation() {
        println("Base area times height")
    }
}
class CylinderPipe (val radius: Int, val h: Int) : CalculatedVolume() {
    val volumeOfCylinder = 3.14 * radius * radius * h
}

// Page 79
open class Animals(val feetCount: Int, val earCount: Int, val name: String) {
    open fun writeTheInfo() {
        println("$name has $feetCount feet and $earCount ears.")
    }
}

class Cats(feetCount: Int, earCount: Int, name: String): Animals(feetCount, earCount, name) {
    override fun writeTheInfo() {
        println("$name has $feetCount feet and $earCount ears. They are so adorable.")
    }

}


// PAGE 89
fun findMinValue(first: Int, second: Int): Int = if (first > second) second else first

data class MyBooks(val name: String, val author: String, val publishedDate: Int)

// PAGE 92
data class MyStudents(val name: String, val number: Int, val classroom: Int ) {

    // ..............................................
    // In Kotlin, the data class produces an operator
    // function called componentN. For this reason,
    // it does not allow manual operation and gives an
    // overload error.
    // ................................................



    /*operator fun component1(): String {
        return name
    }
    operator fun component2(): Int {
        return number
    }
    operator fun component3(): Int {
        return classroom
    }*/
}

