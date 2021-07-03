package br.com.alura

fun main() {
    val pedidos: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 34.0),
        3 to 50.0 // infix tem o mesmo valor que o Pair() só perde na performance
    )
    println(pedidos)
    val pedido: Double? = pedidos[1]
    pedido?.let {
        println("Pedido $it") //pega o pedid[1]
    }

    for (pedido in pedidos) {//no intellij a var pedido fica destacada indicando que tem outra var de mesmo nome
        //porém que são diferentes
        println("Numero do pedido ${pedido.key}")
        println("Valor do pedido ${pedido.value}")
    }

    pedidos[4] = 70.0 // para o pedido 4 ele vai ter o value de 70.0
    println(pedidos)

    pedidos.put(5, 80.0)
    println(pedidos)

    pedidos[1] = 100.00 // atribuindo novo valor a chave 1

    pedidos.putIfAbsent(5, 4.0) // só add se não existir value para a chave

    pedidos.remove(5)
    println(pedidos)

    pedidos.remove(3, 100.0) // só remove se na chave 3 o valor for 100.0

}


