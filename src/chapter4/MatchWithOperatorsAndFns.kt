package chapter4

fun main(args: Array<String>) {
    var a = 10
    val b = 15
    val sum = a+b
    println("Sum = $sum")

    val sum2 = a.plus(b)
    println("Sum = $sum2")

    val diff = a-b
    println("Difference = $diff")

    val diff2 = a.minus(b)
    println("Difference = $diff2")

    a++       // change a to var
    println(a)
    val aNew = a.inc()
    println(aNew)
    println("${++a}")
}
