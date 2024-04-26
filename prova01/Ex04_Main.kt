//Exercício 04
//Crie uma classe Carta que represente uma carta de baralho com atributos como naipe e valor. Crie uma classe Baralhoque represente um baralho de cartas completo. Implemente métodos para embaralhar o baralho, distribuir cartas.
// João Monteiro e Aline
fun main() {
    val deck = Deck()
    deck.shuffle()
    val player = Player()

    player.receiveCards(deck.dealCards(5))
    println("Player's hand: ${player.showHand()}")
    println("Check for combinations: ${player.checkCombinations()}")
}
