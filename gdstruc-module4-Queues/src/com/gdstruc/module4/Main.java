package com.gdstruc.module4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        ArrayQueue arrayQueue = new ArrayQueue(4);
        Scanner scanner = new Scanner(System.in);
        int numberOfGames = 1;


        while (numberOfGames != 11)
        {
            System.out.println("Game " + numberOfGames + ": ");

            if (arrayQueue.size() < 5) {
                int randomNum = (int) Math.floor(Math.random() * (7 - 1 + 1) + 1); // random number 1 to 7
                System.out.println("Start of Turn: \n" + randomNum + " players will be enqueued for matchmaking. \n === Press enter ===");

                if (randomNum == 1) {
                    arrayQueue.enqueue(new Player(1, "Ace", 1000));
                } else if (randomNum == 2) {
                    arrayQueue.enqueue(new Player(2, "King", 900));
                    arrayQueue.enqueue(new Player(3, "Queen", 1200));
                } else if (randomNum == 3) {
                    arrayQueue.enqueue(new Player(4, "Jack", 1300));
                    arrayQueue.enqueue(new Player(5, "Joker", 0));
                    arrayQueue.enqueue(new Player(6, "Clover", 3000));
                } else if (randomNum == 4) {
                    arrayQueue.enqueue(new Player(7, "Spade", 6000));
                    arrayQueue.enqueue(new Player(8, "Heart", 5000));
                    arrayQueue.enqueue(new Player(9, "Diamond", 4000));
                    arrayQueue.enqueue(new Player(10, "Pawn", 100));
                } else if (randomNum == 5) {
                    arrayQueue.enqueue(new Player(11, "Rook", 12000));
                    arrayQueue.enqueue(new Player(12, "Knight", 10000));
                    arrayQueue.enqueue(new Player(13, "Bishop", 10000));
                    arrayQueue.enqueue(new Player(14, "Cleric", 4680));
                    arrayQueue.enqueue(new Player(15, "Bard", 3500));
                } else if (randomNum == 6) {
                    arrayQueue.enqueue(new Player(16, "Wizard", 68000));
                    arrayQueue.enqueue(new Player(17, "Paladin", 18740));
                    arrayQueue.enqueue(new Player(18, "Warrior", 25600));
                    arrayQueue.enqueue(new Player(19, "Rogue", 32400));
                    arrayQueue.enqueue(new Player(20, "Monk", 28000));
                    arrayQueue.enqueue(new Player(21, "Mage", 89000));
                } else if (randomNum == 7) {
                    arrayQueue.enqueue(new Player(22, "Red", 680));
                    arrayQueue.enqueue(new Player(23, "White", 140));
                    arrayQueue.enqueue(new Player(24, "Black", 230));
                    arrayQueue.enqueue(new Player(25, "Blue", 360));
                    arrayQueue.enqueue(new Player(26, "Orange", 750));
                    arrayQueue.enqueue(new Player(27, "Green", 330));
                    arrayQueue.enqueue(new Player(28, "Yellow", 830));
                } else {
                    System.out.println("Error");
                }
                scanner.nextLine();
            }

            if (arrayQueue.size() >= 5)
            {
                System.out.println("\nThere are sufficient amount of players in the lobby.");

                System.out.println("\n=== Game is starting ===\n=== Dequeuing 5 players === ");
                for (int i = 0; i < 5; i++)
                {
                    // remove ing 5 players
                    Player removedPlayer = arrayQueue.dequeue();
                    System.out.println("Removed Player: " + removedPlayer);
                }
                System.out.println("\nPlayers still in Queue:");
                arrayQueue.printQueue();
                System.out.println("\n=== === === === === === === === ===\n");
                numberOfGames++;
            }
        }
    }
}