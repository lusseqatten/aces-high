package com.aces.model;

import java.util.List;

import com.aces.util.CardUtils;

public class Card {

	public static final Card HIDDEN = new Card(CardColor.UNKNOWN, CardValue.UNKNOWN);
	private CardColor color;
	private CardValue value;

	public Card(CardColor c, CardValue ct) {
		this.color = c;
		this.value = ct;
	}

	@Override
	public String toString() {
		return String.format("Color: %s, Type: %s, Value(s): %s", color, value,
				value.getValue());
	}

	public CardValue getCardValue() {
		return value;
	}
	
	public CardColor getCardColor() {
		return color;
	}

	public boolean isAce() {
		return value == CardValue.ACE;
	}

	public int getValue() {
		return value.getValue();
	}
	
	public String getDisplay() {
		return String.format("%s %s (%d)", color.name(),value.name(),value.getValue());
	}
	public String renderCard() {
		String format = CardUtils.getFormat(getCardValue());
		List<String> symbols = CardUtils.getSymbols(value, color);
		return String.format(format, symbols.toArray());
	}

}
