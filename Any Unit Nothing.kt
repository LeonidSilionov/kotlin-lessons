fun main() {
    unit()
    nothing()

    var a: Any = 50
    var b: Int = 50
    var c = '\u0039'




    println(a.toString().toInt() + b)
    println(a.toString().toInt() + b + c.toString().toInt())

}

fun unit(): Unit {
    println(1 + 2)
}

fun nothing(): Nothing {
    while (true) {
        1 + 2
    }
}





