package br.com.alura

fun main() {
    //testaColecao()
    val bancoDeNomes = BancoDeNomes()
    // nomesSalvos obtem uma referencia da coleção nomes
    // e terá comportamento de uma lista. Tudo que fazer nele vai refletir na lista original Shallow copy
    val nomesSalvos: MutableCollection<String> = bancoDeNomes.nomes as MutableCollection<String>
    //bancoDeNomes.nomes.add("Alex") dessa forma é errado pois qualquer um pode alterar a coleção
    bancoDeNomes.salva("Alex")
    println(bancoDeNomes)
    println(BancoDeNomes().nomes)
    nomesSalvos.add("Paulo")
    println(BancoDeNomes().nomes)


}

//o correto é tornar a coleção privada e fazer um propertie get e torna - la Companion
class BancoDeNomes {
    val nomes: Collection<String> get() = dados

    fun salva(nome: String) {
        Companion.dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}

private fun testaColecao() {
    //vc pode usar comportamentos comuns entre as Collections já que list, set, map estão relacionados
    val nomes: MutableList<String> = mutableListOf(
        "Alex",
        "Fran",
        "Gui",
        "Maria",
        "Ana"
    )

    nomes.add("Paulo")
    nomes.remove("Alex")
    val nomes2: Collection<String> = mutableListOf(
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