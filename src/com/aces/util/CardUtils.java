package com.aces.util;

import java.util.ArrayList;
import java.util.List;

import com.aces.model.Card;
import com.aces.model.CardColor;
import com.aces.model.CardValue;

public class CardUtils {
	
	public static List<String> getSymbols(CardValue cardValue, CardColor color) {
		List<String> list = new ArrayList<String>();
		String number;
		if (cardValue.isSuited()) {
			number = cardValue == CardValue.ACE ? "A"
					: cardValue == CardValue.KING ? "K" : cardValue == CardValue.DAME ? "Q" : cardValue == CardValue.KNIGHT ? "J" : "?";
			list.add(number);
			list.add(color.getSymbol());
			list.add(number);
		} else {
			number = String.valueOf(cardValue.getValue());
			list.add(number);
			for (int x = 0; x < cardValue.getValue(); x++) {
				list.add(color.getSymbol());
			}
			list.add(number);
		}

		return list;
	}
	
	public static String getFormat(CardValue type) {
		String s = "";
		
		switch (type) {
		case ACE:
			s = SUITED;
			break;
		case TWO:
			s = TWO;
			break;
		case THREE:
			s = THREE;
			break;
		case FOUR:
			s = FOUR;
			break;
		case FIVE:
			s = FIVE;
			break;
		case SIX:
			s = SIX;
			break;
		case SEVEN:
			s = SEVEN;
			break;
		case EIGHT:
			s = EIGHT;
			break;
		case NINE:
			s = NINE;
			break;
		case TEN:
			s = TEN;
			break;
		default: s = SUITED;
			break;
		}

		return s;
	}

		public static final String TEN=" _________\n"
				+ "%s %s   %s  |\n"
				+ "|   %s %s   |\n"
				+ "|  %s   %s  |\n"
				+ "|   %s %s   |\n"
				+ "|__%s___%s_%s\n";

		public static final String NINE =" _________\n"
				+ "|%s %s   %s  |\n"
				+ "|  %s   %s  |\n"
				+ "|    %s    |\n"
				+ "|  %s   %s  |\n"
				+ "|__%s___%s_%s|\n";
		public static final String EIGHT=" _________\n"
				+ "|%s %s   %s  |\n"
				+ "|  %s   %s  |\n"
				+ "|         |\n"
				+ "|  %s   %s  |\n"
				+ "|__%s___%s_%s|\n";
		public static final String SEVEN=" _________\n"
				+ "|%s %s   %s  |\n"
				+ "|    %s    |\n"
				+ "|  %s   %s  |\n"
				+ "|         |\n"
				+ "|__%s___%s_%s|\n";
		
		public static final String SIX=" _________\n"
				+ "|%s %s   %s  |\n"
				+ "|         |\n"
				+ "|  %s   %s  |\n"
				+ "|         |\n"
				+ "|__%s___%s_%s|\n";
		
		public static final String FIVE=" _________\n"
				+ "|%s %s   %s  |\n"
				+ "|         |\n"
				+ "|    %s    |\n"
				+ "|         |\n"
				+ "|__%s___%s_%s|\n";
		
		public static final String FOUR=" _________\n"
				+ "|%s %s   %s  |\n"
				+ "|         |\n"
				+ "|         |\n"
				+ "|         |\n"
				+ "|__%s___%s_%s|\n";
		
		public static final String THREE=" _________\n"
				+ "|%s   %s    |\n"
				+ "|         |\n"
				+ "|    %s    |\n"
				+ "|         |\n"
				+ "|____%s___%s|\n";
		
		public static final String TWO=" _________\n"
				+ "|%s%s       |\n"
				+ "|         |\n"
				+ "|         |\n"
				+ "|         |\n"
				+ "|_______%s%s|\n";
		
		public static final String SUITED=  "_________\n"
				+ "|%s        |\n"
				+ "|         |\n"
				+ "|    %s    |\n"
				+ "|         |\n"
				+ "|________%s|\n";

}

