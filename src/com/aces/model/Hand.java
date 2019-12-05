package com.aces.model;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.stream.Collectors;

import com.aces.util.CardUtils;

public class Hand extends ArrayList<Card> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void printPlayer() {
		System.out.println("--- Your hand ---");
		print();
	}

	public void print() {
		print(false);
	}

	public void print(boolean isDealer) {
		List<String[]> cardSplits = new ArrayList<String[]>();

		boolean hasHiddenCard = isDealer && size() < 3;
		if (hasHiddenCard) {
			add(Card.HIDDEN);
		}
		for (Card c : this) {
			cardSplits.add(c.renderCard().split("\n"));
		}
		if (cardSplits.size() > 0 || hasHiddenCard) {

			for (int rowNumber = 0; rowNumber < 6; rowNumber++) {
				StringBuilder sb = new StringBuilder();

				for (String[] rows : cardSplits) {
					sb.append(rows[rowNumber]).append(rowNumber == 0 ? "  " : " ");
				}
				System.out.println(sb.toString());
			}
		}
		if (hasHiddenCard) {
			remove(0);
		}
	}

	public void printDealer() {
		System.out.println("--- Dealer hand ---");
		print(true);
	}

	public void printDealerFull() {
		System.out.println("--- Dealer hand ---");
		print();
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
