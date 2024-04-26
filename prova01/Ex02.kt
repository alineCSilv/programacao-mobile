// Exercício 02
// Escreva um programa que dado um inteiro positivo n calcule e imprima o valor da seguinte soma [...]
// João Monteiro e Aline
fun main() {
    println("Digite um número inteiro positivo:")
    val n = readLine()?.toIntOrNull()

    if (n == null || n <= 0) {
        println("Erro: Por favor, digite um número inteiro positivo.")
        return
    }

    var sumEquation = 0.0
    for (i in 1..n) {
        sumEquation += i.toDouble() / (n - i + 1)
    }

    println("O valor de f($n) é: $sumEquation")
}
