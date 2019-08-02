package chapter4
import java.lang.Math.*     // just 1 import for all our job
//import java.lang.Math.abs
//import java.lang.Math.round

fun main(args: Array<String>) {
    val a = 15
    val b = 10
    val sum = a.plus(b)
    println("sum = $sum")
    val diff = a.minus(b)
    println("Difference = $diff")
    val product = a.times(b)
    println("Product = $product")
    val quotient = a.toDouble().div(b)
    println("Quotient = $quotient")
    val remainder = a.rem(b)
    println("Remainder = $remainder")

    val neg = -15.9
    val absolute = abs(neg)
    println(absolute)
    println("${round(absolute)}")
}