package chapter3

/*
=============== NAMEING PACKAGES ================
- Package names should be in lowercse with no underscores
- Use camel-case if necessary for readability


============== NAMEING CLASSES AND INTERFACES=============
- class and interface identifiers start with upper-case character
- use camel-case for readability
- for example :
       data class Person
       interface MyInterface {...}

============= NAMEING VARIABLES =============
- variable and function identifiers start with lower-case character
        val number = 42
        fun add( i : Int , j : Int ) : Int {...}
- use camel-case for readability with multiple words
        val aNumber = 42
        fun addValue(i : Int , j : Int ) : Int {...}

=========== NAMEING CONSTANTS ===============
- constants are declared as members of companion object
- identifiers are upper-case
- use underscore for readability
for example :
*/
class constants {
    companion object {
        const val A_FIXED_VALUE = "a fixed value"
    }
}
