fun main() {
    val a = Triple(1, '\uee41', "иероглиф")

    println(a.first)
    println(a.second)
    println(a.third)

    val b = Triple(3, "небольших", '\udd99')
    println("${b.first}, ${b.second}, ${b.third}")

    val c = Triple(4, 5,6)
    val (x,y,z) = c
    println("$x,$y,$z")

    val d = Triple(7, 8, 9)
    val (e,_,j) = d
    println("$e, $j")

}