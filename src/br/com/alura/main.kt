package br.com.alura

fun main() {
    val pedidos: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 64.0),
        3 to 50.0, // infix tem o mesmo valor que o Pair() só perde na performance
        //4 to null,
        5 to 150.0,
        6 to 80.0
    )
    //val valorPedido = pedidos.getValue(5) // se valor não existir lança uma exception de valor inexistente
    //println(valorPedido)
    println(pedidos[0]) //se valor não existir apresenta como null, diferente do getValue
    println(pedidos.get(0)) // tb dá null se a chave não existir

    println(pedidos.getOrElse(0) { //se o valor n existir ele retorna uma expressão lambda
        "Não tem o pedido"
    })

    println(pedidos.getOrDefault(0, -1)) //se n existir a chave, ela vai ter valor de -1

    println(pedidos.keys)
    println(pedidos.values)

    for (numerosDePedidos in pedidos.keys)//imprime todos numeros de pedidos, chaves
        println("Pedido $numerosDePedidos")

    val pedidosFiltrados = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 50.0
    }

    println(pedidosFiltrados)

    val pedidosAcima = pedidos.filterValues { valor ->
        valor > 50.0
    }

    val pedidosPares = pedidos.filterKeys { numero ->
        numero % 2 == 0
    }

    println(pedidosAcima)
    println(pedidosPares)
}

fun testaMap(pedidos: MutableMap<Int, Double>) {
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


