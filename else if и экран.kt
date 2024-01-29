fun main() {
    val a = 4
    val b = 4

    if (a > b) {println("${a}")}
        if (a == b)
        {println("=")}
    else
        {println("${b}")}
 // это не корректый код для случая когда а>b ниже будет корректный

    if (a > b) {println("${a}")}
    if (a == b)
    {println("=")}
    if (a < b) {println("${b}")}
    
    // принято через else if для читаемости

    if (a > b) {println("${a}")}
    else if (a == b)
    {println("=")}
    else
         {println("${b}")}

    val c =
        if (a>b) {a}
        else if (a<b) {b}
        else if (a==b) {"="}
        else {""}
     println("\"Значение ${c}\"")

    }






