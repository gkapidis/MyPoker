import java.util.*;

public interface CardHolder {

	public List<Card> getHand();

	public Map<Rank, Integer> getRankStats();

	public Map<Suit, Integer> getSuitStats();

	public Rank getMaxRank();

	public Rank getMinRank();

	public void setMinRank(Rank minRank);

	public void setMaxRank(Rank maxRank);
}
