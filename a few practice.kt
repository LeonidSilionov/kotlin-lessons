fun main() {
    println("Hello")


    var a: Byte = 43
    var b: Short = 257
    var c = a + b
    var d = a.toShort() + b.toFloat()


    println(c.javaClass.typeName)
    println(c)
    println(d.javaClass.typeName)
    println(d)

    var e: Int = 2_000_000_000 + 1_000_000_000
    println(e)
    var i = 1F
    var j = 1L
    println(i.javaClass.typeName)
    println(j.javaClass.typeName)

    val k = '\u00ff'
    println(k)
    val l = '\u00dd'
    println(l)
    println("$k + $l")
    println('\u00aa')

    var m = """Hello,
        |my dear friend,
        
    """.trimMargin()
    var n = """
    |Leonid 
            |Silionov
    """.trimMargin()

    println(m + "${n.trimIndent()}")
    println("Если Вас зовут ${n.trimMargin()} то вы хороший человек")


}
