fun main() {

    for (i in (1..10).filter { it != 3 }) {
        if (i % 2 == 0) {
            continue
        }
        println(i)
    }

    for (i in (1..5)) {
        println("i=$i")
        if (i == 3) {
            continue
        }
        for (j in (1..5)) {
            println("j=$j")
            if (j == 2) {
                break
            }
        }
    }
}




