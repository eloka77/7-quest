//Função Lambda para Cálculo de Gorjeta

val calcularGorjeta: (Double?) -> Double = {
    if (it == null || it < 0) {
        0.0
    } else {
        it
    }
}

fun main() {
    println("Gorjeta válida: R$ ${calcularGorjeta(15.0)}")
    println("Gorjeta nula: R$ ${calcularGorjeta(null)}")
}