fun main() {
    val nomes: Collection<String> = setOf(
        "Alex",
        "Fran",
        "Gui",
        "Maria",
        "Ana"
    )

 for (nome in nomes){
     println(nome)
 }

    println(nomes)
    println("Tem o nome Alex ${nomes.contains("Alex")}")
    println("Tamanho do nome Alex é ${nomes.size}")

}