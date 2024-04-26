//Exercício 04
//Crie uma classe Carta que represente uma carta de baralho com atributos como naipe e valor. Crie uma classe Baralhoque represente um baralho de cartas completo. Implemente métodos para embaralhar o baralho, distribuir cartas.
// João Monteiro e Aline

import kotlin.random.Random

class Deck {
    private val suits = listOf("Espadas", "Copas", "Ouros", "Paus")
    private val values = listOf("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K")
    private var cards = mutableListOf<Card>()

    init {
        suits.forEach { suit ->
            values.forEach { value ->
                cards.add(Card(value, suit))
            }
        }
    }

    fun shuffle() {
        cards.shuffle()
    }

    fun dealCards(quantity: Int): List<Card> {
        if (quantity <= cards.size) {
            val dealtCards = cards.take(quantity)
            cards = cards.drop(quantity).toMutableList()
            return dealtCards
        } else {
            throw IllegalArgumentException("Not enough cards to deal.")
        }
    }
}
