import java.util.*;

public class Registration {

	List<Player> Ptable = new ArrayList<Player>();

	public void registerPlayer(Player o) {
		Ptable.add(o);
	}

	public List<Player> getPtable() {
		return Ptable;
	}

}
