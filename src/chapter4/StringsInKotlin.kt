package chapter4

fun main(args: Array<String>) {
    var str = "Hamid"
    println(str)
    val empty = String()
    println("'$empty'")
    val charArray = str.toCharArray()
    println(charArray.toList())
    val byteArray = str.toByteArray()
    println(byteArray.toList())
    str += "Mohamadi"
    println(str)

    val len = str.length
    for (i in 0 until len) {
        val c: Char = str.get(i)
        println(c)
    }
    val p = str.indexOf("h")
    val sub = str.substring(p)
    println(p)

    val str2 = str.toUpperCase()
    val match = str.equals(str2 , true)
    println("Do they match? $match")
}