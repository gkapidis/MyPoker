
public class Player  {
	
	public String name;
	
	private int tableSpot;
	
	private CardHolder hand = new PlayerHand();

	public Player(String name, int tableSpot){
		this.name=name;
		this.tableSpot=tableSpot;
	}
	public CardHolder getPlHand(){
		return hand;
	}
	
	public int getTablespot(){
		return tableSpot;
	}
	
	
}
