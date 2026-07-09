fun main() {
    val a1 = arrayOf('A', 'B', 'C', 'D', 'E', 'F')
    println("Array with values")
    println(a1.joinToString())

    val a2 = Array<Int>(6){0}
    println("Empty array")
    println(a2.joinToString())

    val a3 = Array<Int>(6){i -> i*i}
    println("Array Constructor")

    println(a3.joinToString())

    val a4 = Array(2){Array<Int>(2){2} }
    println("Two Dimensional Array")
    println(a4.contentDeepToString())

}