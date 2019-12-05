package com.aces.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

	private List<Card> cards = new ArrayList<Card>();

	public Deck() {
		cards.add(new Card(CardColor.SPADES, CardValue.ACE));
		cards.add(new Card(CardColor.SPADES, CardValue.TWO));
		cards.add(new Card(CardColor.SPADES, CardValue.THREE));
		cards.add(new Card(CardColor.SPADES, CardValue.FOUR));
		cards.add(new Card(CardColor.SPADES, CardValue.FIVE));
		cards.add(new Card(CardColor.SPADES, CardValue.SIX));
		cards.add(new Card(CardColor.SPADES, CardValue.SEVEN));
		cards.add(new Card(CardColor.SPADES, CardValue.EIGHT));
		cards.add(new Card(CardColor.SPADES, CardValue.NINE));
		cards.add(new Card(CardColor.SPADES, CardValue.TEN));
		cards.add(new Card(CardColor.SPADES, CardValue.KNIGHT));
		cards.add(new Card(CardColor.SPADES, CardValue.DAME));
		cards.add(new Card(CardColor.SPADES, CardValue.KING));

		cards.add(new Card(CardColor.HEARTS, CardValue.ACE));
		cards.add(new Card(CardColor.HEARTS, CardValue.TWO));
		cards.add(new Card(CardColor.HEARTS, CardValue.THREE));
		cards.add(new Card(CardColor.HEARTS, CardValue.FOUR));
		cards.add(new Card(CardColor.HEARTS, CardValue.FIVE));
		cards.add(new Card(CardColor.HEARTS, CardValue.SIX));
		cards.add(new Card(CardColor.HEARTS, CardValue.SEVEN));
		cards.add(new Card(CardColor.HEARTS, CardValue.EIGHT));
		cards.add(new Card(CardColor.HEARTS, CardValue.NINE));
		cards.add(new Card(CardColor.HEARTS, CardValue.TEN));
		cards.add(new Card(CardColor.HEARTS, CardValue.KNIGHT));
		cards.add(new Card(CardColor.HEARTS, CardValue.DAME));
		cards.add(new Card(CardColor.HEARTS, CardValue.KING));

		cards.add(new Card(CardColor.CLUBS, CardValue.ACE));
		cards.add(new Card(CardColor.CLUBS, CardValue.TWO));
		cards.add(new Card(CardColor.CLUBS, CardValue.THREE));
		cards.add(new Card(CardColor.CLUBS, CardValue.FOUR));
		cards.add(new Card(CardColor.CLUBS, CardValue.FIVE));
		cards.add(new Card(CardColor.CLUBS, CardValue.SIX));
		cards.add(new Card(CardColor.CLUBS, CardValue.SEVEN));
		cards.add(new Card(CardColor.CLUBS, CardValue.EIGHT));
		cards.add(new Card(CardColor.CLUBS, CardValue.NINE));
		cards.add(new Card(CardColor.CLUBS, CardValue.TEN));
		cards.add(new Card(CardColor.CLUBS, CardValue.KNIGHT));
		cards.add(new Card(CardColor.CLUBS, CardValue.DAME));
		cards.add(new Card(CardColor.CLUBS, CardValue.KING));

		cards.add(new Card(CardColor.DIAMONDS, CardValue.ACE));
		cards.add(new Card(CardColor.DIAMONDS, CardValue.TWO));
		cards.add(new Card(CardColor.DIAMONDS, CardValue.THREE));
		cards.add(new Card(CardColor.DIAMONDS, CardValue.FOUR));
		cards.add(new Card(CardColor.DIAMONDS, CardValue.FIVE));
		cards.add(new Card(CardColor.DIAMONDS, CardValue.SIX));
		cards.add(new Card(CardColor.DIAMONDS, CardValue.SEVEN));
		cards.add(new Card(CardColor.DIAMONDS, CardValue.EIGHT));
		cards.add(new Card(CardColor.DIAMONDS, CardValue.NINE));
		cards.add(new Card(CardColor.DIAMONDS, CardValue.TEN));
		cards.add(new Card(CardColor.DIAMONDS, CardValue.KNIGHT));
		cards.add(new Card(CardColor.DIAMONDS, CardValue.DAME));
		cards.add(new Card(CardColor.DIAMONDS, CardValue.KING));

		List<Card> shuffled = new ArrayList<Card>();

		Random r = new Random();

		while (!cards.isEmpty()) {
			Card randomCard = cards.remove(r.nextInt(cards.size()));
			shuffled.add(randomCard);
		}
		cards = shuffled;
	}

	public void print() {
		System.out.println(cards);
	}

	public Card draw() {
		return cards.remove(cards.size() - 1);
	}

}
