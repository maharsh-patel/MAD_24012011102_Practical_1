fun main(){
    print("Enter First Number: ")
    val Num1 = readln().toInt()

    print("Enter Second Number: ")
    val Num2 = readln().toInt()

    println(addition(Num1, Num2))
    println(subtraction(Num1, Num2))
    println(multiplication(Num1, Num2))
    println(division(Num1, Num2))

}

fun addition(Num1:Int, Num2:Int): Int{
    return Num1+Num2
}

fun subtraction(Num1:Int, Num2:Int): Int{
    return Num1-Num2
}

fun multiplication(Num1:Int, Num2:Int): Int{
    return Num1*Num2
}

fun division(Num1:Int, Num2:Int): Int{
    return Num1/Num2
}

