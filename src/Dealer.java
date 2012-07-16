import java.util.*;

public class Dealer {

	CardHolder tableHand = new TableHand();
	List<Player> Ptable;

	Deck d = new Deck();
	Deal tempDeal = new Deal(d);

	public Dealer(Registration r) {
		this.Ptable = r.getPtable();
		this.deal();
	}

	private void deal() {
		// deal to players
		for (int y = 0; y < 5; y++) {
			for (int i = 0; i < Ptable.size(); i++) {

				tempDeal.deal(Ptable.get(i).getPlHand());

			}
		}

		// deal to players 2nd time
		// for (int i = 0; i < Ptable.size(); i++) {
		// Ptable.get(i).getPlHand().getHand().add(d.drawCardFromDeck());
		// }

		// //deal to table
		// for(int i=0; i<5; i++){
		// tableHand.getHand().add(d.drawCardFromDeck());
		// }
		// //add table cards to player existing hand
		// //for(int i=0; i<Ptable.size(); i++){
		// // for(int y=0; y<tableHand.getHand().size(); y++)
		// //
		// Ptable.get(i).getPlHand().getHand().add(tableHand.getHand().get(y));
		// //}
		// //sort Players hand

	}
}