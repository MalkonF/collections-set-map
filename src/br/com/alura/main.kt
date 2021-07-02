package br.com.alura

fun main() {
    val assistiramCursoAndroid: Set<String> = setOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin: Set<String> = setOf("Alex", "Paulo", "Maria")

    val assistiramAmbos = mutableSetOf<String>()

    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)
    assistiramAmbos.add("Ana")
    assistiramAmbos.add("Ana")
    println(assistiramAmbos)

    // faz a mesma coisa linha 16 e 17
    println(assistiramCursoAndroid + assistiramCursoKotlin)
    println(assistiramCursoAndroid.union(assistiramCursoKotlin))
    println(assistiramCursoAndroid union assistiramCursoKotlin) //in fix

    println(assistiramCursoAndroid - assistiramCursoKotlin)
    println(assistiramCursoAndroid subtract assistiramCursoKotlin)
    //pega as pessoas que assistiram ambos os cursos
    println(assistiramCursoAndroid intersect assistiramCursoKotlin)

    val toMutableList = assistiramAmbos.toMutableList()
    toMutableList.add("Alex")
    println(toMutableList) //volta a repetir os elementos pois foi transformada para uma lista mutável
    println(toMutableList.toSet())//volta a retirar os elementos repetidos
}
