// Exercício 03
// Crie uma classe abstrata Animal com atributos como nome, idade e som. Crie classes derivadas de Animal para representar diferentes tipos de animais, como cachorro, gato e pássaro. Implemente métodos específicos para cada tipo de animal, como latir, miar e cantar. Utilize herança e polimorfismo para criar uma lista de animais e exibir informações sobre cada um deles.
// João Monteiro e Aline
fun main() {
    val animals = listOf(
        Cachorro("Scooby", 5, "cachorro"),
        Gato("Phebe", 3, "gato"),
        Passaro("Chico", 2, "pássaro")
    )

    animals.forEach { animal ->
        println("${animal.name} é um ${animal.species}, tem ${animal.age} anos e faz '${animal.emitSound()}'")
    }
}