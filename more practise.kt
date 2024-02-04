


fun main() {

    for (i in(1..10).filter {it !=3 }){
        if (i % 2 == 0){
            continue
        }
        println(i)
    }
}

