fun testaComportamentos(){
    val pedidos: MutableMap<Int, Double> = mutableMapOf(
    Pair(1, 20.0),
    Pair(2, 34.0),
    3 to 50.0,
    4 to 100.0,
    5 to 150.0,
    6 to 80.0

)
//    val valorPedido: Double? = pedidos.getValue(5)
//    println(pedidos)

//   println(pedidos.getOrElse(0) {
//       "Não tem o pedido"
//   })

val mensagem:Double? = pedidos.getOrElse(0) {
    0.0
}

println(mensagem)
println(pedidos.getOrDefault(1, -1.0))
println(pedidos.getOrDefault(0,-1.0))

println(pedidos.keys)

for(numero:Int in pedidos.keys){
    println("Pedido $numero")
}

println(pedidos.values)

for (valor:Double? in pedidos.values){
    println("Valor do pedido: $valor")
}

val pedidosFiltrados:Map<Int, Double> = pedidos.filter { (numero:Int, valor:Double) ->
    numero % 2 == 0 && valor > 50.0
}
println(pedidosFiltrados)

val pedidosAcima =pedidos.filterValues { valor->
    valor>70
}

val pedidosPares = pedidos.filterKeys { numero ->
    numero % 2 ==0
}
}
fun testaMap(pedidos: MutableMap<Int, Double>) {
    println(pedidos)
    val pedido: Double? = pedidos[3]
    pedido?.let {
        println("pedido $it")
    }
    for (p: Map.Entry<Int, Double> in pedidos) {
        println("numedo do pedido: ${p.key}")
        println("numedo do pedido: ${p.value}")
    }
    pedidos[4] = 70.0
    println(pedidos)
    pedidos.put(5, 80.0)
    println(pedidos)
    pedidos[1] = 100.0
    println(pedidos)
    pedidos.putIfAbsent(6, 200.0)
    println(pedidos)
    pedidos.putIfAbsent(6, 300.0)
    println(pedidos)

    pedidos.remove(6)
    println(pedidos)
    pedidos.remove(3, 50.0)
    println(pedidos)
}