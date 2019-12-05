package com.aces.model;

public enum CardColor {
	CLUBS("♣"), HEARTS("♥"), DIAMONDS("♦"), SPADES("♠"), UNKNOWN("?");
	
	private String symbol;

	private CardColor(String symbol) {
		this.symbol = symbol;
	}

	public String getSymbol() {
		return symbol;
	}

}
