package com.gdstruc.otie.midterms;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CardStack stack = new CardStack();
        CardStack hand = new CardStack();
        CardStack pile = new CardStack();
        int deck = 30;
        int discardPile = 0;
        int sizeOfHand = 0;
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        stack.push(new Card("King"));
        stack.push(new Card("Queen"));
        stack.push(new Card("Jack"));
        stack.push(new Card("Joker"));
        stack.push(new Card("Pickles"));
        stack.push(new Card("King"));
        stack.push(new Card("Queen"));
        stack.push(new Card("Jack"));
        stack.push(new Card("Joker"));
        stack.push(new Card("Pickles"));
        stack.push(new Card("King"));
        stack.push(new Card("Queen"));
        stack.push(new Card("Jack"));
        stack.push(new Card("Joker"));
        stack.push(new Card("Pickles"));
        stack.push(new Card("King"));
        stack.push(new Card("Queen"));
        stack.push(new Card("Jack"));
        stack.push(new Card("Joker"));
        stack.push(new Card("Pickles"));
        stack.push(new Card("King"));
        stack.push(new Card("Queen"));
        stack.push(new Card("Jack"));
        stack.push(new Card("Joker"));
        stack.push(new Card("Pickles"));
        stack.push(new Card("King"));
        stack.push(new Card("Queen"));
        stack.push(new Card("Jack"));
        stack.push(new Card("Joker"));
        stack.push(new Card("Pickles"));


        while (stack.isEmpty() == false)
        {
            System.out.println(" --- --- --- ");
            String input = scanner.nextLine();
            int command = rand.nextInt(3);
            if (command == 0) {
                int drawCards = (int) Math.floor(Math.random() * (5 - 1 + 1) + 1);
                System.out.println("Command " + command + ": Draw " + drawCards + " cards");

                for (int i = 0; i < drawCards; i++)
                {
                    if (stack.isEmpty() == false) {
                        hand.push(stack.peek());
                        stack.pop();
                        sizeOfHand++;
                        deck--;
                    }
                }

            } else if (command == 1) {
                int discardCards = (int) Math.floor(Math.random() * (5 - 1 + 1) + 1);
                System.out.println("Command " + command + ": Discard " + discardCards + " cards");

                if (hand.isEmpty() == false && sizeOfHand > discardCards)
                {
                    for (int i = 0; i < discardCards; i++)
                    {
                    pile.push(hand.peek());
                    hand.pop();
                    discardPile++;
                    sizeOfHand--;
                    }
                }
                else
                {
                    System.out.println("There are not enough cards on hand! ");
                }

            } else if (command == 2) {
                int getCards = (int) Math.floor(Math.random() * (5 - 1 + 1) + 1);
                System.out.println("Command " + command + ": Get " + getCards + " cards from the discarded pile");

                if (pile.isEmpty() == false && discardPile > getCards)
                {
                    for (int i = 0; i < getCards; i++)
                    {
                        hand.push(pile.peek());
                        pile.pop();
                        discardPile--;
                        sizeOfHand++;
                    }
                }
                else
                {
                    System.out.println("There are not enough cards on the discard pile! ");
                }


            } else {
                System.out.println("Uh Oh");
            }

            scanner.nextLine();
            hand.printStack();
            System.out.println("Remaining cards in the player's deck: " + deck);
            System.out.println("Number of cards on discard pile: " + discardPile);

        }
        scanner.nextLine();
    }
}