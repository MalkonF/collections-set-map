package br.com.alura

fun main() {
//vc pode usar comportamentos comuns entre as Collections já que list, set, map estão relacionados
    val nomes: List<String> = listOf(
        "Alex",
        "Fran",
        "Gui",
        "Maria",
        "Ana"
    )
    val nomes2: Collection<String> = listOf(
        "Alex",
        "Fran",
        "Gui",
        "Maria",
        "Ana"
    )

    val nomes3: Iterable<String> = setOf(
        "Alex",
        "Fran",
        "Gui",
        "Maria",
        "Ana"
    )
    for (nome in nomes)//aqui é um exemplo de um list utilizando iterator do Iterable
        println(nome)

    println(nomes)
    println(nomes2)
    println(nomes3)

    println("Tem o nome Alex? ${nomes.contains("Alex")}")
    println("Tamanho da coleção ${nomes.size}")//aqui nomes3 n vai funcionar, pois é uma Iterable e n compartilha o mesmo comportamento

}