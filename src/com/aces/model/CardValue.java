package com.aces.model;

public enum CardValue {
	
	ACE(11), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), 
	SEVEN(7), EIGHT(8), NINE(9), TEN(10), KNIGHT(10), DAME(10),
	KING(10), UNKNOWN(0);

	int value;

	private CardValue(int value) {
		this.value = value;

	}
	
	public int getValue() {
		return value;
	}
	
	public boolean isSuited() {
		return this==ACE || this==KING || this==DAME || this==KNIGHT || this==UNKNOWN;
	}
	
}