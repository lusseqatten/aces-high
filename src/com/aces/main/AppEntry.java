package com.aces.main;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.aces.model.CardValue;
import com.aces.model.Deck;
import com.aces.model.Hand;

public class AppEntry {

	private static final List<String> POSITIVE_ANSWERS = new ArrayList<String>(
			Arrays.asList(new String[] { "yes", "y", "ja", "j" }));

	public static void main(String[] args) {

		boolean gameOn = true;
		Scanner scan = new Scanner(System.in);

		while (gameOn) {
			gameOn = doGame(scan);
		}

		scan.close();
	}

	private static boolean doGame(Scanner scan) {

		Deck deck = new Deck();
		Hand playerHand = new Hand();
		Hand dealerHand = new Hand();
		boolean isGameOver = false;
		boolean playerStay = false;
		boolean dealerStay = false;
		scan.nextLine();
		deck.draw(); // vaska ett kort TODO: Ska detta vara med?
		System.out.println("Threw a card in the pile..");
		scan.nextLine();
		System.out.println("Dealer drew a hidden card");
		dealerHand.printDealer();
		scan.nextLine();
		System.out.println("Player draw");
		playerHand.add(deck.draw());
		dealerHand.printDealer();
		playerHand.printPlayer();
		scan.nextLine();
		System.out.println("Dealer draw");
		dealerHand.add(deck.draw());
		dealerHand.printDealer();
		playerHand.printPlayer();
		scan.nextLine();
		System.out.println("Player draw");
		playerHand.add(deck.draw());

		while (!isGameOver) {

			if (!playerStay) {
				dealerHand.printDealer();
				playerHand.printPlayer();
				System.out.println("Hit?");
				if (POSITIVE_ANSWERS.contains(scan.next())) {
					playerHand.add(deck.draw());
					dealerHand.printDealer();
					playerHand.printPlayer();
				} else {
					playerStay = true;
				}
			}
			System.out.println();

			int playerScore = playerHand.getScore();
			if (!playerStay) {
				if (playerScore > 21) {
					System.out.println("You lost");
					playerStay = true;
					scan.nextLine();
				} else if (playerScore == 21) {
					System.out.println("!** BURAKKU JAKKURUU **!");
					playerStay = true;
					scan.nextLine();
				} else {
					scan.nextLine();
				}
			}

			int dealerScore = dealerHand.getScore();
			if (dealerScore < 17 && playerStay) {
				dealerHand.add(deck.draw());
				dealerHand.printDealer();
				playerHand.printPlayer();
				scan.nextLine();
				if (dealerScore > 21) {
					dealerStay = true;
				}
			} else {
				dealerStay = true;
				scan.nextLine();
			}
			isGameOver = dealerStay && playerStay;

		}
		
		dealerHand.printDealerFull();
		playerHand.printPlayer();
		
		if (playerHand.getScore() > dealerHand.getScore() && !playerHand.isThicc()
				|| dealerHand.isThicc() && !playerHand.isThicc()) {
			System.out.printf("You won!");
		} else if (!dealerHand.isThicc()) {
			System.out.printf("Dealer won! :(");
		} else if (playerHand.isBlackJack() && dealerHand.isBlackJack()) {
			System.out.printf("Draw, double black jack");
		} else {
			System.out.printf("You both went thicc..");
		}

		System.out.println("\n\nWould you like to play again?");
		String choice = scan.next();
		boolean playMore = POSITIVE_ANSWERS.contains(choice);

		return playMore;
	}

}
