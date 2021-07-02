package br.com.alura

fun main() {
    val pedidos = mapOf<Int, Double>(
        Pair(1, 20.0),
        Pair(2, 34.0),
        3 to 50.0 // infix tem o mesmo valor que o Pair() só perde na performance
    )
    println(pedidos)
    val pedido: Double? = pedidos[1]
    pedido?.let {
        println("Pedido $it") //pega o pedid[1]
    }

    for (pedido in pedidos) {
        println("Numero do pedido ${pedido.key}")
        println("Valor do pedido ${pedido.value}")

    }
}


