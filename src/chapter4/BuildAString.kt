package chapter4

fun main(args: Array<String>) {
    val builder = buildString {"to be or not to be\n"
        "that is the question\n"
        "to be or not to be\n"
        "that is the question"
    }
    val result = builder.toString()
    println(result)
}