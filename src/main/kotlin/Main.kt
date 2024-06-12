const val INFO = "text"
//val - переменные только для чтения
//var - переменные изменяемые
//const val вне функции - переменная компиляции

//котлин может сам умеет определять тип переменной, можно проверить через байт код Tools -> Kotlin REPL

//переменные есть ссылочные и примитивные. Integer & int



fun main () {
        println(INFO)
        var text = "string"

    var angry = true
    var happy = false
    val everyday = !happy && !angry
    val emotions: String = if (!happy) {
        "yes, happy"
    } else { "not today, unhappy"}
    }

