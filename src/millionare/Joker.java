package millionare;

public class Joker extends Card {
	private final String name = "JK";

	public String toString() {
		return name;
	}

	public int rankCompareTo(Card c) {
		if (c instanceof Plain) {
			return 1;
		} else {
			return 0;
		}
	}

	public boolean suitEquals(Card c) {
		return false;
	}
}
