fun main() {
    maps()
}

/*
    Un Mapa o Mapeo tambien llamado en otros lenguajes como Diccionario
     guarda los datos en pares, por un lado la clave y el otro el valor.
     Al llamar a la clave nos permite acceder al valor emparejado a dicha clave.
     Los mapas son utiles para acceder a cada valor sin un indice como las listas.
     Cada llave/valor son unicos, si hay dos items o valores duplicados, no serian identicos
     ya que no comparten clave por lo tanto serian pares distintos.
 */




fun maps(){

    // Al igual que las listas y los sets, los mapas tiene los mapas de solo lectura y los mutable
    val readOnlyMenu = mapOf("Pizza" to 100, "Empanada" to 20, "Manaos" to 35) // {Pizza=100, Empanada=20, Manaos=35}

    println(readOnlyMenu)

    // Un Mapa mutable recibe dos parametros en este caso uno String y otro Int
    val restaurantMenu: MutableMap<String, Int> = mutableMapOf("Pizza" to 100, "Empanada" to 20, "Manaos" to 35)

    println(restaurantMenu)

    // Tambien se los puede bloquear en otra variable para evitar modificaciones indeseadas

    val restaurantMenuLocked = restaurantMenu

    println(restaurantMenuLocked)

    // Para poder acceder al valor de un par en un mapa debemos llamar a la key o llave de dicho valor usando [ ]

    println("El valor de la pizza en pesos es: ${readOnlyMenu["Pizza"]}")

    // Para hallar la cantidad de pares dentro de un mapa podemos usar .count()

    println("Este mapa tiene ${readOnlyMenu.count()} objetos")

    /*
        En los matas mutables podemos agregar pares con .put() o eliminar pares con .remove()
        De forma similar que las listas y los sets con la diferencia que en vez de un solo valor seria un par de valores
     */

    restaurantMenu.put("Ensalada", 35)
    println(restaurantMenu)

    restaurantMenu.remove("Empanada")
    println(restaurantMenu)

    // para chequear si una clave ya esta dentro de un mapa usamos .containKey() o para valores con .containValue()

    println(restaurantMenu.containsKey("Ensalada")) // True

    // Si queremos listar de forma visual los valores por separado o las llaves por separado podemos usar la propiedad:

    println(restaurantMenu.values)
    println(restaurantMenu.keys)

    /*
        Dichas propiedades son propias de una clase que pueden ser utilizadfas en variables como los mapas.
     */

    // Para revisar si un valor o llave esta en el mapa podemos usar el operador in

    println("Empanada" in restaurantMenu) // False
    println("Pizza" in restaurantMenu) // True

    



}