package millionare;

public abstract class Card {
	public abstract int rankCompareTo(Card c);

	public abstract boolean suitEquals(Card c);
}
