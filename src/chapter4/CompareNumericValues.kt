package chapter4

fun main(args: Array<String>) {
    val a = 10
    val b = 15
    val match = (a==b)  // equality operator
    println("Match = $match")

    val match2 = a.equals(b) // squal() fn
    println("Match = $match2")

    println("Comparison result = ${a.compareTo(b)}")

    /* there is a point here :
    click tools on menu => kotlin => show kotlin bytecode
    and then click Decompile on top of the page
    then compare what (==) do in kotlin & equal()
     */
}