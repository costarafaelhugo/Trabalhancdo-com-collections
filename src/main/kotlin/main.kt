fun main() {
    val pedidos: List<Pedido> = listOf(
        Pedido(1, 20.0),
        Pedido(2, 60.0),
        Pedido(3, 30.0),
        Pedido(4, 70.0),
    )
    println(pedidos)
  val pedidosMapeados:Map<Int, Pedido> = pedidos.associateBy { pedido -> pedido.numero }

    println(pedidosMapeados)
    println(pedidosMapeados[1])

val pedidosFreteGratis= pedidos.associateWith { pedido ->
        pedido.valor>50.0
    }
    println(pedidosFreteGratis)
}


data class Pedido(val numero: Int, val valor: Double)


