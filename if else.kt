fun main() {
    if (5 > 3)
    { println("правда")}

    if (5 < 3)
    {println("правда")}
    else
    {println("ложь")}

    val a = 7
    val b = 6
    println(if (a > b) {"${a}"} else {"${b}"})
    println(if (a<b){"a"} else {"b"})

    val x = 11
    val y = 10
    val z = if (x>y) {x}
    else {y}
    println(z)


}