fun main() {
    sets()
}

fun sets() {

    /*
        Al contrario de las listas que son ordenadas y permiten items duplicados, los sets son desordenadas y convierten
        un item o valor en unico evitando la duplicidad de los mismos.
     */

    /*
        Para crear un set, solo hay que establecerlas como las mismas
        sabiendo que hay Read-Only y Mutables como las listas
     */


    val marcasTecno = setOf("Nvidia", "AMD", "Intel", "AMD")
    // [Nvidia, AMD, Intel]


    val criptomonedas: MutableSet<String> = mutableSetOf("Bitcoin", "Ethereum", "Litecoin", "Litecoin", "Doge Coin")
    // [Bitcoin, Ethereum, Litecoin, Doge Coin]


    println(marcasTecno)

    println(criptomonedas)


    // Tambien podemos crear un set bloqueado para evitar modificaciones en los valores

    val criptomonedasLocked: Set<String> = criptomonedas

    println(criptomonedasLocked)

    // Los Sets no tienen un orden o sea que nos impide agarrar objetos por indice como si podiamos en las listas

    // Podemos usar .count para contar los objetos o valores dentro de la misma

    println(marcasTecno.count())
    // A pesar de haber escrito en el Set 4 valores devuelve solo el valor 3 ya que hay un valor repetido

    // Podemos revisar si un valor esta dentro del Set utilizando la operacion in devolviendonos un True o False

    println("Bitcoin" in criptomonedasLocked) // devuelve True
    println("LucmaCoin" in criptomonedasLocked) // devuelve False

    // Para añadir valores a un set (mutable) al igual que en una lista se utiliza .add() y para eliminar valores .remove()

    criptomonedas.add("LucmaCoin") // Agrega LucmaCoin
    println(criptomonedas) // [Bitcoin, Ethereum, Litecoin, Doge Coin, LucmaCoin]


    criptomonedas.remove("LucmaCoin") // Elimna LucmaCoin
    println(criptomonedas) // [Bitcoin, Ethereum, Litecoin, Doge Coin]

    

}
