package cF

fun main() {
    condicionIf()
    condicionWhen()
}

/*
    Los condicionales nos permiten controlar según datos o valores como debe reaccionar nuestro programa
 */


/*
    If o en español: Si; Es un condicional que evalua un dato para realizar algo,
    si ese dato no cumple con lo requerido, se sigue con el programa.
    En caso de querer realizar algo al no cumplir lo requerido se coloca un Else o en español: Si No;
 */
fun condicionIf(){
    val dato = 5

    if (dato > 5) {
        println("Supero el numero 5")
    }
    else {
        println("No supera el numero 5")
    }

    // También se puede escribir como expresion condicional de esta manera
    println(if (dato > 4) "Supera el numero 4" else "No supera el numero 4")
}

/*
    El condicional When es un Cuando, el cual evalua la variable o dato y segun el valor se realiza algo
    Si no entra a ninguna opcion se puede colocar un Else para realizar algo o continuar con el programa.
 */

fun condicionWhen(){
    val  saludo: String = "Hola"

    /* Se puede escribir como un condicional
    when (saludo) {

        "Hola" -> println(saludo)

        "Hello" -> println("Imposible leer")

    else -> println("Error desconocido")

     */

    // y también como una expresion condicional para guardar el dato en una variable

    val mensaje = when(saludo) {

        "Hola" -> saludo

        "Hello" -> "Imposible leer"

        else -> "Error desconocido"
    }

    println(mensaje)

    val temp = 18

    val descripcion = when {
        // Si la temperatura es menor a 0, descripcion será "Muy Frio"
        temp < 0 -> "Muy Frio"
        // Si la temperatura es menor a 10, descripcion sera "Liberamente Frio"
        temp < 10 -> "Ligeramente frio"
        // Si la temperatura es menor a 20, descripcion sera "Tibio"
        temp < 20 -> "Tibio"
        // Si ninguna de las demás condiciones se cumplen, descripcion será "Caliente"
        else -> "Caliente"
    }
    println(descripcion)


}