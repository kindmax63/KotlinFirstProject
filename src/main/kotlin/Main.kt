const val INFO = "text"
//val - переменные только для чтения
//var - переменные изменяемые
//const val вне функции - переменная компиляции
//котлин сам умеет определять тип переменной, можно проверить через байт код Tools -> Kotlin REPL
//переменные есть ссылочные и примитивные. Integer & int
// в котлин есть интервалы ranges

fun main () {
    println(INFO)
    var text = "string"

    var level = 1

    var angry = true
    var happy = true
    //можно объявлять переменную с условными выражениями &, ||, != и другими
    val everyday = !happy && !angry
    val emotions: String = if (!happy) {
        "yes, happy"
    } else { "not today, unhappy"}
    println (emotions)

    //интервалы в условиях
    if (level in 1..5){
        println("level less 6")
    }
    //until не берет верхнюю границу
    if (level in 1 until 5){
        println("level between 1 and 4")
    }
    //downTo
    if (level in 1 downTo 5){
        println("интервал с убывающими значениями - downTo")
    }


    }

