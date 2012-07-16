import java.util.*;

public class PlayerHand implements CardHolder {

	List<Card> PlayerHand = new ArrayList<Card>();

	private Map<Rank, Integer> rankStats = new HashMap<Rank, Integer>();
	private Map<Suit, Integer> suitStats = new HashMap<Suit, Integer>();
	private Rank maxRank = Rank.ACE;
	private Rank minRank = Rank.DEUCE;

	public List<Card> getHand() {
		return PlayerHand;
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