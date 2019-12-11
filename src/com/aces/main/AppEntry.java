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
		System.out.println("Är du redo att vaska?");
		Deck deck = new Deck();
		Hand playerHand = new Hand();
		Hand dealerHand = new Hand();
		boolean gameActive = true;
		boolean playerActive = true;
		boolean dealerActive = true;
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

		while (gameActive) {

			if (playerActive) {
				dealerHand.printDealer();
				playerHand.printPlayer();
				System.out.println("Hit?");
				if (POSITIVE_ANSWERS.contains(scan.next())) {
					playerHand.add(deck.draw());
					dealerHand.printDealer();
					playerHand.printPlayer();
				} else {
					playerActive = false;
				}
			}
			System.out.println();

			if (playerActive) {
				int playerScore = playerHand.getScore();
				if (playerScore > 21) {
					System.out.println("You lost");
					playerActive = false;
					scan.nextLine();
				} else if (playerScore == 21) {
					System.out.println("!** BURAKKU JAKKU **!");
					playerActive = false;
					scan.nextLine();
				} else {
					scan.nextLine();
				}
			}

			if (!playerActive) {
				if (dealerHand.getScore() < 17) {
					dealerHand.add(deck.draw());
					dealerHand.printDealer();
					playerHand.printPlayer();
					scan.nextLine();
				} else{
					dealerActive = false;
				}
			}
			gameActive = dealerActive && playerActive;

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
