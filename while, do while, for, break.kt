fun main() {
    var a = 5
    var b = 6
    var x = 2
    var y = 3
    var e  = 244.0
    val numbers = 1..3
    var j = 100*20



   while (a > 0) {
       println(a--)
//        //a--
//        //--a
   }
    do {println(b)
        b--
    }
    while (b > 1)

    for (i in 1..10) {
        println(x*y)
        x--
    }
    for (i in numbers)
        println("привет, Мир!")
    while (a<b) {
        println(e)
        e /= 2
        if (e in (0.9..1.4)) {break}
    }

    for (i in 0..5) {
        println(j)
        j *= 4
        if (j >= 80001)
        {break}
    }


}