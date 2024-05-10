fun main() {
    negocio()
    varsDeclarar()
}

// Hay dos formas de declarar una variable

/*
Una seria usar " var " la cual es para almacenar una variable que pueden ser modificadas a posteri

La segunda es usar " val " la cual sirve para almacenar variables que son unicamente de lectura la cual no se pueden modificar a posteri
 */


fun negocio () {
     val clientes = 10
     var precioPizzaMuzza = 1500

    // Podemos usar un " $ " para encadenar al string una variables y convertirla a string.
    println("El negocio tiene $clientes clientes!")

    // Tambien podemos encerrar la variable en llaves " { } " para incrustar un bloque de codigo antes de pasarse a String
    // Por ejemplo en este caso sumarle un valor a la variable a pasar.

    println("Nuestra pizza vale ${precioPizzaMuzza + 500 } ARS")



}


/*              Tipos de datos:
    Integers                   Byte, Short, Int, Long
    Unsigned integers          UByte, UShort, UInt, ULong
    Floating-point numbers     Float, Double
    Booleans                   Boolean
    Characters                 Char
    Strings                    String
 */


fun varsDeclarar() {

    /* Como vimos antes una variable puede ser declarada de dos formas: Var y Val
       Tambien las podemos declarar asignarle un valor y luego inicializarlas para un mejor ejemplo mirad lo siguiente:
     */
    val num: Int

    num = 10

    println(num)

    // De la misma forma, podemos juntar las dos lineas para realizar una sola de la siguiente manera:

    val nombre:String = "Lucma"

    println(nombre)

}

