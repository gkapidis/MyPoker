public class Card implements Comparable<Card> {
	private final Rank rank;
	private final Suit suit;

	public Card(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}

	public Rank getRank() {
		return rank;
	}

	public Suit getSuit() {
		return suit;
	}

	public String toString() {
		return rank + " of " + suit;
	}

	public int compareTo(Card card) {
		return rank.compareTo(card.getRank());
	}

	public boolean equals(Object o) {
		if ((o instanceof Card) && (((Card) o)).getRank() == this.rank) {
			return true;
		} else {
			return false;
		}
	}
}