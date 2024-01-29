import javax.swing.border.EmptyBorder


fun main(){
    val AgeLeonid = 36
    val AgeViktor = 37
    val a = (AgeLeonid >=40) && (AgeViktor <=25)
    println(a)
    val b = (AgeLeonid >=35) || (AgeViktor <=20)
    println(b)
    val c = (AgeLeonid!=36) || !(AgeViktor>=37)
    println(c)

    val isCheck = true
    println("Проверка ${!AgeLeonid.toString().isEmpty()}")


    val x = "Hello"
    val y = "Hi"
    println(x==y)

    val x1 = true
    val y1 = "Jerom"
    val z1 = 140

    println(x1==true && y1=="Jerom"||z1>=150)

    val name = "Leonid"
    val name2 = "Ivan"

    println(name.length)
    println(name2.length)
    println(name.length>name2.length)
    println(name.isEmpty())



}

