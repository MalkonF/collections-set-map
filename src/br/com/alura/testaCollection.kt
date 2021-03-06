package br.com.alura


fun testaCopia() {
    //testaColecao()
    val bancoDeNomes = BancoDeNomes()
    bancoDeNomes.salva("Alex")
    val nomesSalvos: Collection<String> =
        bancoDeNomes.nomes //agora ao inves da referencia vai obter uma copia da lista. Se vc
    //add um novo elemento na lista original após a copia isso n vai refletir na copia
    //bancoDeNomes.nomes.add("Alex") dessa forma é errado pois qualquer um pode alterar a coleção
    println(bancoDeNomes)
    println(BancoDeNomes().nomes)
    println(nomesSalvos)
}

//o correto é tornar a coleção privada e fazer um propertie get e torna - la Companion
class BancoDeNomes {
    val nomes: Collection<String> get() = dados.toList()

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