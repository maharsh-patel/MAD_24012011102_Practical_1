fun main(){

    val arrayList = arrayListOf(13, 50, 60, 17, 48)

    println("Displaying elements:")
    for (i in arrayList.indices) {
        println("a[$i]=${arrayList[i]}")
    }
    println()

    val max = arrayList.maxOrNull()
    println("Largest element =$max")
}