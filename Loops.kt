fun main() {
    fistLoop@ for (i in 1..5) {
        println("i = $i")
        secondLoop@ for (j in 1..5) {
            println("j = $j")
            if (j == 2) {
                break@fistLoop
            }
            if (i % 2 == 0) {
                continue@secondLoop
            }
            else println("ничо  не понятно но интересно")
        }
    }
}