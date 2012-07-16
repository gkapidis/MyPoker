import java.util.*;

public class TableHand implements CardHolder {

	List<Card> tableCards = new ArrayList<Card>();
	private Map<Rank, Integer> rankStats = new HashMap<Rank, Integer>();
	private Map<Suit, Integer> suitStats = new HashMap<Suit, Integer>();
	private Rank minRank = Rank.DEUCE;
	private Rank maxRank = Rank.ACE;

	public List<Card> getHand() {

		return tableCards;
	}

	
	public Map<Rank, Integer> getRankStats() {

		return rankStats;
	}

	
	public Map<Suit, Integer> getSuitStats() {

		return suitStats;
	}

	
	public Rank getMaxRank() {

		return maxRank;
	}

	
	public Rank getMinRank() {

		return minRank;
	}

	public void setMinRank(Rank minRank) {
		this.minRank = minRank;

	}

	
	public void setMaxRank(Rank maxRank) {
		this.maxRank = maxRank;

	}
}