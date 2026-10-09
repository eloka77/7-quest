//Sistemas de Cupons

fun calcularDesconto(valor: Double, cupom: String?): Double {
    return when (cupom) {
        "PROMO10" -> valor - 10
        "PROMO20" -> valor - 20
        else -> valor
    }
}

fun main() {
    println("Com cupom PROMO10: R$ ${calcularDesconto(100.0, "PROMO10")}")
    println("Com cupom nulo: R$ ${calcularDesconto(100.0, null)}")
}