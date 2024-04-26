//Exercício 04
//Crie uma classe Carta que represente uma carta de baralho com atributos como naipe e valor. Crie uma classe Baralhoque represente um baralho de cartas completo. Implemente métodos para embaralhar o baralho, distribuir cartas.
// João Monteiro e Aline
class Player {
    private var hand: List<Card> = listOf()

    fun receiveCards(cards: List<Card>) {
        hand = cards
    }

    fun showHand(): List<Card> = hand

    fun checkCombinations(): String {
        val valuesCount = hand.groupingBy { it.value }.eachCount()
        val suitsCount = hand.groupingBy { it.suit }.eachCount()

        val hasFlush = suitsCount.any { it.value == 5 }
        val groups = valuesCount.values.sorted()
        val hasFullHouse = groups == listOf(2, 3)
        val hasThreeOfAKind = groups.contains(3) && !hasFullHouse
        val hasPair = groups.contains(2) && !hasFullHouse && groups.filter { it == 2 }.size == 1
        val hasTwoPair = groups.filter { it == 2 }.size == 2

        return when {
            hasFlush -> "Flush"
            hasFullHouse -> "Full House"
            hasThreeOfAKind -> "Trinca"
            hasTwoPair -> "Dois Pares"
            hasPair -> "Par"
            else -> "No Winning Combination"
        }
    }
}
