// Exercício 03
// Crie uma classe abstrata Animal com atributos como nome, idade e som. Crie classes derivadas de Animal para representar diferentes tipos de animais, como cachorro, gato e pássaro. Implemente métodos específicos para cada tipo de animal, como latir, miar e cantar. Utilize herança e polimorfismo para criar uma lista de animais e exibir informações sobre cada um deles.
// João Monteiro e Aline
class Cachorro (name: String, age: Int, species: String) : Animal(name, age, species) {
    override fun emitSound() = "Au au!"
}