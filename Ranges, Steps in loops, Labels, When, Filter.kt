


fun main() {
    for (i in (1..3)) {
        println(i)
    }

    for (i in (1 until 5)) {
        println(i)
    }

    for (i in (2..<8)) {
        println(i)
    }


    for (i in (10 downTo 8)) {
        println(i)
    }
    for (i in (10 downTo 5) step 3) {
        println(i)
    }

    for (i in (1..5).filter { it != 3 }) {
        println(i)
    }

    for (i in (10 downTo 1).filter { it != 10 }) {
        if (i == 3) {
            continue
        }
        if (i == 2) {
            break
        }
        println(i)
    }


}



