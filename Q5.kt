//Classificação de Feedback de Motoristas

fun avaliarMotorista(nota: Int?) {

    val notaFinal = nota ?: 0

    when (notaFinal) {
        5 -> println("Excelente corrida!")
        4 -> println("Boa corrida.")
        1, 2, 3 -> println("Precisamos melhorar.")
        0 -> println("Nenhuma avaliação fornecida.")
    }
}

fun main() {
    print("Digite a nota do motorista (1 a 5) ou aperte Enter para nulo: ")
    val entrada = readlnOrNull()


    val nota = entrada?.toIntOrNull()


    avaliarMotorista(nota)
}