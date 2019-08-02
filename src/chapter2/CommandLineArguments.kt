package chapter2

fun main(args: Array<String>) {
    println(args[0])
    println("Welcome to kotlin essential training")
    println("The first argument is : " + args[0])
    println("Welcome to kotlin essential training, ${args[0]}")
}

/*
When you call a Kotlin based application from the command line you can pass values known
as arguments, they're also sometimes called parameters. Just as in Java the starting chapter2.main function
accepts an array of string values and you refer to those values using simple array syntax.
The name of the function is always chapter2.main lowercase. The name of the argument, the array,
can be anything you like but traditionally is called args and the type is array and the array contains
items typed as strings.
That's the notation in Kotlin.
 */
// go to menu -> run -> edit configuration -> fill the table of chapter2.main class & program arguments

