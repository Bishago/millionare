package millionare;

import java.util.ArrayList;
import java.util.List;

public class Plain extends Card {
	public enum Rank {
		THREE("3"), FOUR("4"), FIVE("5"), SIX("6"), SEVEN("7"), EIGHT("8"), NINE("9"), TEN("10"), JACK("J"), QUEEN(
				"Q"), KING("K"), ACE("A"), DEUCE("2");

		private final String rank;

		Rank(String rank) {
			this.rank = rank;
		}

		public String toString() {
			return rank;
		}
	}

	public enum Suit {
		SPADES("\u2660"), HEARTS("\u2661"), DIAMONDS("\u2662"), CLUBS("\u2663");

		private final String suit;

		Suit(String suit) {
			this.suit = suit;
		}

		public String toString() {
			return suit;
		}
	}

	private final Rank rank;
	private final Suit suit;

	private Plain(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}

	public Rank rank() {
		return rank;
	}

	public Suit suit() {
		return suit;
	}

	public String toString() {
		return suit.toString() + rank.toString();
	}

	public int rankCompareTo(Card c) {
		if (c instanceof Plain) {
			Plain p = (Plain) c;
			return this.rank.ordinal() - p.rank.ordinal();
		} else {
			return -1;
		}
	}

	public boolean suitEquals(Card c) {
		if (c instanceof Plain) {
			Plain p = (Plain) c;
			return this.suit.equals(p.suit);
		} else {
			return false;
		}
	}

	private static final List<Plain> protoDeck = new ArrayList<Plain>();

	// Initialize prototype deck
	static {
		for (Suit suit : Suit.values())
			for (Rank rank : Rank.values())
				protoDeck.add(new Plain(rank, suit));
	}

	public static ArrayList<Plain> newDeck() {
		return new ArrayList<Plain>(protoDeck); // Return copy of prototype deck
	}
}
