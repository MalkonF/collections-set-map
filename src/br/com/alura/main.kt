package br.com.alura

fun main() {
    val assistiramCursoAndroid: Set<String> = setOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin: List<String> = listOf("Alex", "Paulo", "Maria")

    //val assistiramAmbos = assistiramCursoKotlin + assistiramCursoAndroid //se inverter dá erro na linha 9. Pq
    // ele retorna o tipo do primeiro arg ou seja o assistiramCursoAndroid que é um set e n da pra fazer
    //[0] em sets
    val assistiramAmbos: Set<String> = assistiramCursoAndroid + assistiramCursoKotlin

    println(assistiramAmbos)

//println(assistiramAmbos[0])// pegando primeiro elemento da lista
}
