//Limpeza de Banco de Dados de Usuários

fun limparUsuarios(emails: List<String?>) {
    var contasInvalidas = 0

    for (email in emails) {
        val tamanho = email?.length ?: 0

        if (email == null || tamanho == 0) {
            contasInvalidas++
            println("Aviso: Conta inválida detectada. Marcar para deleção.")
        } else {
            println("Conta válida: $email")
        }
    }

    println("Total de contas que precisam ser apagadas: $contasInvalidas")
}

fun main() {
    val listaEmails = listOf("user@email.com", null, "", "aluno@uninorte.edu.br")
    limparUsuarios(listaEmails)
}