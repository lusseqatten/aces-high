package com.aces.model;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Hand extends ArrayList<Card> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void printPlayer() {
		int score = getScore();

		System.out.println("--- Your hand ---");
		System.out.println("Current score: " + score);
		System.out.println(this.stream().map(c -> c.getDisplay()).collect(Collectors.joining(", ")));
	}

	public void printDealer() {
		int score = getScore();

		System.out.println("--- Dealer hand ---");
		System.out.println("Current score: Unknown + " + (size() > 1 ? score - get(0).getValue() : "-"));
		System.out.println(
				this.subList(1, this.size()).stream().map(c -> c.getDisplay()).collect(Collectors.joining(", ")));
	}

	public void printDealerFull() {
		int score = getScore();
		System.out.println("--- Dealer hand ---");
		System.out.println("Current score: " + score);
		System.out.println(this.stream().map(c -> c.getDisplay()).collect(Collectors.joining(", ")));

	}

	public int getScore() {
		int score = 0;
		int aceCount = 0;

		for (Card c : this) {
			if (c.isAce()) {
				aceCount++;
			}
			score += c.getValue();
		}

		while (aceCount > 0) {
			if (score > 21) {
				score -= 10;
				aceCount--;
			} else {
				break;
			}
		}

		return score;
	}

	public boolean isBlackJack() {
		return 21 == getScore();
	}

	public boolean isThicc() {
		return getScore() > 21;
	}

}
