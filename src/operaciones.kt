fun main() {
    calculo()
}

fun calculo() {
    var num = 5

    // Vamos a usar una var que va a pasar por una serie de calculos para luego ser mostrado en consola.

    /*
    En este caso se sumaria 5 unidades a el valor base quedando el valor 10
    Tambien se puede escribir como:
    num = num + 5
    aunque de forma simplificada seria algo como:
     */

    num += 5
    println(num)


    // Al anterior valor se le restara 2, dejando el valor 8
    num -= 2
    println(num)

    // Ahora se multiplicaria por 3, dejando 24 como valor
    num *= 3
    println(num)

    // y por ultimo el valor es dividido por 5, quedando como valor final 4
    num /= 5
    println(num)
}