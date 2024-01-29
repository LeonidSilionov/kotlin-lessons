fun main() {
    val a = Pair(123, 321)

    val sum = a.first + a.second
    println(sum)


    val b = Triple(1, "cake", '\uff55')
    val (x, y, z) = b
    println("$x,$y,$z")
    println(x.javaClass.typeName)
    println(y.javaClass.typeName)
    println(z.javaClass.typeName)

    val c = Triple(1, 2, 3)
    val (x1, _, z1) = c
    println(c)
    println("$x1,$z1")
    println(z1)
    println("$x1")

    val d: Triple<Int, Int, Int> = Triple(123, 124, 125)
    println(d.third+d.first)

}
