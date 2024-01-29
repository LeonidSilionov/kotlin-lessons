fun main() {
    val a = Pair(1, 2)

    println(a.first)
    println(a.second)

    val b = 3 to 4
    println(b.first)
    println(b.second)

    val c = Pair(5, "Шесть")
    println(c.first)
    println(c.second)

    val d = 7 to 8
    println("${d.first}, ${d.second}")

    val e = 9 to 10
    val e1 = e.first
    val e2 = e.second
    println("$e1, $e2")

}