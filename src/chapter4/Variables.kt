package chapter4
val myName : String = "Hamid"
fun main(args: Array<String>) {
    val a : Int = 10   // val is immutable
    var b : Int = 20   // var is mutable
    println("The initial value of a is $a")
    val c : Double = a.toDouble()  // kus of "var" we can initialize it
    println(c)
    println("My name is $myName")
}