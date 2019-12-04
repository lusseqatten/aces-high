package com.aces.model;

public class Card {

	private CardColor color;
	private CardType type;

	public Card(CardColor c, CardType ct) {
		this.color = c;
		this.type = ct;
	}

	@Override
	public String toString() {
		return String.format("Color: %s, Type: %s, Value(s): %s", color, type,
				type.getValue());
	}

	public CardType getCardType() {
		return type;
	}
	
	public CardColor getCardColor() {
		return color;
	}

	public boolean isAce() {
		return type == CardType.ACE;
	}

	public int getValue() {
		return type.getValue();
	}
	
	public String getDisplay() {
		return String.format("%s %s (%d)", color.name(),type.name(),type.getValue());
	}

}
