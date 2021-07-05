package br.com.alura

fun main() {
    val pedidos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 60.0),
        Pedido(3, 30.0),
        Pedido(4, 70.0)
    )

    println(pedidos)//mapeia numeros dos pedidos para cada pedido
    val pedidosMapeados: Map<Int, Pedido> = pedidos.associate { pedido: Pedido ->
        Pair(pedido.numero, pedido)
    }

    //ja relaciona o pedido com o pedido.numero sem vc precisar colocar referencia ao pedido
    val pedidosMapeadosBy: Map<Int, Pedido> = pedidos.associateBy { pedido: Pedido ->
        pedido.numero
    }
    //vai pegar todos os pedidos com valor maior que 50
    val pedidosFreteGratis = pedidos.associateWith { pedido ->
        pedido.valor > 50.0
    }

    //aqui vai trazer somente um pedido true e outro false(sempre o último)
    val mapa: Map<Boolean, Pedido> = pedidos.associateBy { pedido: Pedido ->
        pedido.valor > 50.0
    }
    //agrupa os pedidos true e false juntos
    val pedidosFreteGratisAgrupados: Map<Boolean, List<Pedido>> = pedidos.groupBy { pedido: Pedido ->
        pedido.valor > 50.0
    }

    val nomes = listOf("Ana", "Maria", "João", "Rafael", "Rogerio")
    val agenda: Map<Char, List<String>> = nomes.groupBy { nome ->
        nome.first()
    }

    println(pedidosMapeados)
    println(pedidosMapeados[1])
    println(pedidosMapeadosBy)
    println(pedidosFreteGratis)
    println(pedidosFreteGratis[Pedido(numero = 1, valor = 20.0)])
    println(mapa)
    println(pedidosFreteGratisAgrupados[true])//pega somente os pedidos true
    println(agenda)
    println(agenda['R'])
}

data class Pedido(val numero: Int, val valor: Double)




