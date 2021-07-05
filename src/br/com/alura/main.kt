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

    println(pedidosMapeados)
    println(pedidosMapeados[1])
    println(pedidosMapeadosBy)
    println(pedidosFreteGratis)
    println(pedidosFreteGratis[Pedido(numero=1, valor=20.0)])
}

data class Pedido(val numero: Int, val valor: Double)




