package chapter4

fun main(args: Array<String>) {
    val myInt: Int = 10
    val myLong: Long = myInt.toLong()

    //================ Reflection ====================
    println("The type of myLong is ${myLong::class.simpleName}") // output : Long
    println("The type of myLong is ${myLong::class.qualifiedName}") // output : kotlin.lang

    //=============== Down casting ===================
    val myLong2 = 42.6
    val myInt2 = myLong2.toInt()
    println("The type of myLong2 is $myLong2")
    println("The type of myInt2 is $myInt2")

    //=============== Up casting =====================
    val myInt3 = 547
    val myDouble = myInt3.toDouble()
    println("The value of myDouble is $myDouble")
}