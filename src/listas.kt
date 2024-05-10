fun main() {
    listitas()
}

fun listitas(){

    /*
       Bueno, tenemos dos tipos de listas al igual que las variables hay una lista de solo lectura (Read-Only)
       y otra (lista) mutable.

       Se las diferencia gracias a las funciones listOf y mutableListOf.
    */

    val formasFiguras = listOf("Cuadrado", "Triangulo", "Redondo")
    println(formasFiguras)

    /*
        Para declarar las mutables Lists podemos declarar explicitamente o de antemano el tipo de dato a usar con:
         MutableList<Tipo>
    */

    val nombres: MutableList<String> = mutableListOf("Lucma", "Gian", "Avery", "Ember", "Aurora")
    println(nombres)

    /*
        Para evitar que nuestras listas mutables puedan tener modificaciones indeseadas podemos bloquear la lista en
        otra lista bloqueada para perservar el valor de la misma.

        Definirla como tal es tan facil como colocar su tipo como List seguido al tipo de dato a guardar
     */

    val nombresLocked: List<String> = nombres

    println(nombresLocked)

    /*
        Las listas son ordenadas eso quiere decir que cada objeto o item dentro de la lista esta enumerado
        y se puede acceder de forma individual. (Obviando el hecho de que el primer elemento es 0)
    */

    println("La posicion 2 de la lista de nombres es: ${nombresLocked[2]}")
    println("La posicion 1 de la lista de figuras es: ${formasFiguras[1]}")


    /*
        Como extra, hay algo llamado funcion de extension
        En este caso serian los .first() y .last() los cuales permiten
        acceder al primero en la lista o al ultimo de la lista respectivamente.
     */

    println("El primero de la lista de nombres es: ${nombresLocked.first()}")
    println("El ultimo de la lista de figuras es: ${formasFiguras.last()}")

    /*
        Luego tambien tenemos .count que cuenta, cuantos objetos o items contiene la lista
     */

    println("La cantidad de items de la lista de nombres es: ${nombresLocked.count()}") // devuelve 5

    /*
        Podemos chequear si un item o valor esta contenido dentro de una lista
        se utiliza in el cual devuelve un valor boolean osea True o False (Verdadero o Falso)
     */

    println("Cuadrado" in formasFiguras) // devuelve true
    println("Rectangulo" in formasFiguras) // devuelve false


    // En una lista mutable se puede agregar o eliminar valores o items con .add() o .remove() respectivamente

    // Si agregamos un valor o item a una lista se colocara ultimo
    nombres.add("Asta")
    println(nombres.last())

    // nombres: [Lucma, Gian, Avery, Ember, Aurora, Asta]
    nombres.remove("Gian")
    // nombres: [Lucma, Avery, Ember, Aurora, Asta]

    println(nombres)


}