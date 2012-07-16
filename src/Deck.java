import java.util.Date;
import java.util.Random;

public class Deck {
	private Card[] deck = new Card[52];
	private Random rgen = new Random(new Date().getTime());
	private int usedCard = 0;

	public Deck() {
		this.createDeck();

	}

	private void createDeck() {
		int tmp = 0;
		for (Suit s : Suit.values())
			for (Rank r : Rank.values()) {
				deck[tmp++] = new Card(r, s);

			}

		for (int i = 0; i < deck.length; i++) {
			int randomPosition = rgen.nextInt(deck.length);
			Card temp = deck[i];
			deck[i] = deck[randomPosition];
			deck[randomPosition] = temp;
		}

	}

	public void printDeck() {
		for (int i = 0; i < deck.length; i++) {
			System.out.println(deck[i]);
		}
	}

	public Card drawCardFromDeck() {

		return deck[usedCard++];

	}
}
