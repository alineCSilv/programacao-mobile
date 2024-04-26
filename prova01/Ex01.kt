// Exercício 01
// Escreva um programa que leia um número entre 1 e 12 correspondendo a um mês do ano e imprima o nome desse mês. Utilize o comando when. Caso o valor seja fora deste intevalo, imprima uma mensagem de erro.
// João Monteiro e Aline

fun main() {
    println("Digite um número entre 1 e 12 para selecionar um mês:")
    val monthNumber = readLine()?.toIntOrNull() ?: 0

    val monthName = when (monthNumber) {
        1 -> "Janeiro"
        2 -> "Fevereiro"
        3 -> "Março"
        4 -> "Abril"
        5 -> "Maio"
        6 -> "Junho"
        7 -> "Julho"
        8 -> "Agosto"
        9 -> "Setembro"
        10 -> "Outubro"
        11 -> "Novembro"
        12 -> "Dezembro"
        else -> "Erro: número fora do intervalo válido."
    }

    println(monthName)
}
