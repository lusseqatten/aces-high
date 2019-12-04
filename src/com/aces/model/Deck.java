package com.aces.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

	private List<Card> cards = new ArrayList<Card>();

	public Deck() {
		cards.add(new Card(CardColor.SPADES, CardType.ACE));
		cards.add(new Card(CardColor.SPADES, CardType.TWO));
		cards.add(new Card(CardColor.SPADES, CardType.THREE));
		cards.add(new Card(CardColor.SPADES, CardType.FOUR));
		cards.add(new Card(CardColor.SPADES, CardType.FIVE));
		cards.add(new Card(CardColor.SPADES, CardType.SIX));
		cards.add(new Card(CardColor.SPADES, CardType.SEVEN));
		cards.add(new Card(CardColor.SPADES, CardType.EIGHT));
		cards.add(new Card(CardColor.SPADES, CardType.NINE));
		cards.add(new Card(CardColor.SPADES, CardType.TEN));
		cards.add(new Card(CardColor.SPADES, CardType.KNIGHT));
		cards.add(new Card(CardColor.SPADES, CardType.DAME));
		cards.add(new Card(CardColor.SPADES, CardType.KING));

		cards.add(new Card(CardColor.HEARTS, CardType.ACE));
		cards.add(new Card(CardColor.HEARTS, CardType.TWO));
		cards.add(new Card(CardColor.HEARTS, CardType.THREE));
		cards.add(new Card(CardColor.HEARTS, CardType.FOUR));
		cards.add(new Card(CardColor.HEARTS, CardType.FIVE));
		cards.add(new Card(CardColor.HEARTS, CardType.SIX));
		cards.add(new Card(CardColor.HEARTS, CardType.SEVEN));
		cards.add(new Card(CardColor.HEARTS, CardType.EIGHT));
		cards.add(new Card(CardColor.HEARTS, CardType.NINE));
		cards.add(new Card(CardColor.HEARTS, CardType.TEN));
		cards.add(new Card(CardColor.HEARTS, CardType.KNIGHT));
		cards.add(new Card(CardColor.HEARTS, CardType.DAME));
		cards.add(new Card(CardColor.HEARTS, CardType.KING));

		cards.add(new Card(CardColor.CLUBS, CardType.ACE));
		cards.add(new Card(CardColor.CLUBS, CardType.TWO));
		cards.add(new Card(CardColor.CLUBS, CardType.THREE));
		cards.add(new Card(CardColor.CLUBS, CardType.FOUR));
		cards.add(new Card(CardColor.CLUBS, CardType.FIVE));
		cards.add(new Card(CardColor.CLUBS, CardType.SIX));
		cards.add(new Card(CardColor.CLUBS, CardType.SEVEN));
		cards.add(new Card(CardColor.CLUBS, CardType.EIGHT));
		cards.add(new Card(CardColor.CLUBS, CardType.NINE));
		cards.add(new Card(CardColor.CLUBS, CardType.TEN));
		cards.add(new Card(CardColor.CLUBS, CardType.KNIGHT));
		cards.add(new Card(CardColor.CLUBS, CardType.DAME));
		cards.add(new Card(CardColor.CLUBS, CardType.KING));

		cards.add(new Card(CardColor.DIAMONDS, CardType.ACE));
		cards.add(new Card(CardColor.DIAMONDS, CardType.TWO));
		cards.add(new Card(CardColor.DIAMONDS, CardType.THREE));
		cards.add(new Card(CardColor.DIAMONDS, CardType.FOUR));
		cards.add(new Card(CardColor.DIAMONDS, CardType.FIVE));
		cards.add(new Card(CardColor.DIAMONDS, CardType.SIX));
		cards.add(new Card(CardColor.DIAMONDS, CardType.SEVEN));
		cards.add(new Card(CardColor.DIAMONDS, CardType.EIGHT));
		cards.add(new Card(CardColor.DIAMONDS, CardType.NINE));
		cards.add(new Card(CardColor.DIAMONDS, CardType.TEN));
		cards.add(new Card(CardColor.DIAMONDS, CardType.KNIGHT));
		cards.add(new Card(CardColor.DIAMONDS, CardType.DAME));
		cards.add(new Card(CardColor.DIAMONDS, CardType.KING));

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
