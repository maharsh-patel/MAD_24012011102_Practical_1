//primary constructor


open class Car(var model: String) {

    var price: Double = 0.0
    constructor(p:Double , m:String) : this(m){
        price = p
    }

}

class Suzuki (m: String) : Car(m)

fun main() {

    val c1 = Car( 2500000.00, "BMW")
    val c2 = Suzuki(  "Grand Vttara")

    println(c1.model)
    println(c1.price)

    println(c2.model)
    println(c2.price)
}
