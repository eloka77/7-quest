//Auditoria de Entregas

fun auditarEntregas(enderecos: List<String?>) {
    for (endereco in enderecos) {
        val enderecoFinal = endereco ?: "Endereço Desconhecido"

        if (enderecoFinal == "Endereço Desconhecido") {
            println("Entrega Pendente: Falta de dados")
        } else {
            println("Rota traçada para: $enderecoFinal")
        }
    }
}

fun main() {
    val lista = listOf("Rua A, 123", null, "Av. Brasil, 456")
    auditarEntregas(lista)
}