public class testme {

	public static void main(String[] args) {

		Registration r = new Registration();

		Player p1 = new Player("Giwrgos", 0);
		Player p2 = new Player("Leonidas", 1);
		Player p3 = new Player("Alekos", 2);
		Player p4 = new Player("Nikos", 3);
		Player p5 = new Player("Kwstas", 4);
		Player p6 = new Player("Vasilis", 5);
		Player p7 = new Player("Penny", 6);
		Player p8 = new Player("Lola", 7);
		Player p9 = new Player("Takis", 8);

		r.Ptable.add(p1);
		r.Ptable.add(p2);
		r.Ptable.add(p3);
		r.Ptable.add(p4);
		r.Ptable.add(p5);
		r.Ptable.add(p6);
		r.Ptable.add(p7);
		r.Ptable.add(p8);
		r.Ptable.add(p9);
		Dealer dealer = new Dealer(r);
		// For TESTING
		for (int i = 0; i < r.getPtable().size(); i++) {
			System.out.println(r.getPtable().get(i).name);
			System.out
					.println("At Spot " + r.getPtable().get(i).getTablespot());
			for (int y = 0; y < 5; y++) {
				System.out.println(r.getPtable().get(i).getPlHand().getHand()
						.get(y));

			}
			System.out.println(" ");

		}

		// System.out.println("Sto trapezi yparxoun ");
		// for (int y = 0; y < 5; y++) {
		//
		// System.out.println(d.tableHand.getHand().get(y));
		// }
		System.out.println("-----------------------");

		for (int i = 0; i < r.getPtable().size(); i++) {
			System.out.println(r.getPtable().get(i).getPlHand().getRankStats().entrySet());
			System.out.println(r.getPtable().get(i).getPlHand().getSuitStats().entrySet());
			System.out.println(HandEvaluator.of(r.Ptable.get(i).getPlHand()));
		}

	}

}
