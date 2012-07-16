public class Deal {

	private Deck deck;

	public Deal(Deck d) {
		this.deck = d;
	}

	public void deal(CardHolder ch) {
		Card tempCard;
		tempCard = deck.drawCardFromDeck();
		if (ch.getHand().contains(tempCard)) {
			ch.getRankStats().put(tempCard.getRank(),
					ch.getRankStats().get(tempCard.getRank()) + 1);
		} else {
			ch.getRankStats().put(tempCard.getRank(), 1);
		}
		// suit stats
		if (ch.getHand().isEmpty()) {
			ch.getSuitStats().put(tempCard.getSuit(), 1);
		}
		if (!(ch.getHand().isEmpty())
				&& ch.getHand().get(0).getSuit().ordinal() == tempCard.getSuit().ordinal()) {
			ch.getSuitStats().put(tempCard.getSuit(), ch.getSuitStats().get(tempCard.getSuit()) + 1);
		} else {
			ch.getSuitStats().put(tempCard.getSuit(), 1);
		}
		ch.getHand().add(tempCard);

	}

}