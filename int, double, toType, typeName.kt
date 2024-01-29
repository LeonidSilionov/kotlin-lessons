fun main() {
    var i: Int = 10
    var e: Double = 51.1
    i = e.toInt()
    println(i)

    var price: Double = 11.99
    var quantity: Int = 1234
    var total = price * quantity
    println(total.javaClass.typeName)
}