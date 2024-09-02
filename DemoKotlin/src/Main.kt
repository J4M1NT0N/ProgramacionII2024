//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Hello f*kin world")
    println("Ingresa tu nombre")
    val name = readLine()
    println("Hola, mi nombre es $name!")
    /* Ya se hacer un comentario */
    /**
     * El key doc es una buena practica
     * porque
     */
    var x = 5
    x =10
    val y = 5
    y = 10 /* cuando se asigna con val no se puede reasignar una variable */

    val c = 10
    val d = 5
    printl(c > d) //true
    printl(c >= d) //
    printl(c < d)
    printl(c <= d)
    printl(c == d)
    printl(c != d) //true
    
    for(i in 0..3) {
        printl(i)
    }
    for(i in 0 until 3){
        print(i)
    }

    for(i in 2..8 step){
        print(i)
    }

    for(i in 3 downTo 0){
        print(i)
    }

}

fun printl(i: Int) {

}
