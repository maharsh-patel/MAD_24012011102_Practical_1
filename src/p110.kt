class Car(m: String) {

    var model: String = ""
    var price: Double = 0.0

    init{
        model = m
    }

    constructor(p:Double , m:String) : this(m){
        price = p
    }

}

fun main() {
    val c1 = Car( 2500000.00, "BMW")

    println(c1.model)
    println(c1.price)
}
