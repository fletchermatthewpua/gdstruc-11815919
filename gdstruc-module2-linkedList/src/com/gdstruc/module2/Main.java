package com.gdstruc.module2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // add players to the ArrayList
        Player goku = new Player(1, "Goku", 9001);
        Player vegeta = new Player(2, "Vegeta", 9000);
        Player broly = new Player(3, "Broly", 20000);

        // add the players to a linked list
        PlayerLinkedList linkedList = new PlayerLinkedList();
        linkedList.addToFront(goku);
        linkedList.addToFront(vegeta);
        linkedList.addToFront(broly);

        // add one more player
        linkedList.addToFront(new Player(10, "Yamcha", 500));

        // print the elements of the starting from the head
        linkedList.printList();

        // prints how many elements are on the list
        linkedList.sizeOfList();

        //Removing the first element
        linkedList.removeFirst();

        // print the elements but without the first element in the last print
        linkedList.printList();

        // prints how many elements are on the list
        linkedList.sizeOfList();

        // checks is the list hasan element named Broly
        System.out.println("Does the linked list contain the name 'Zephyr': " + linkedList.containsElement("Zephyr"));

        // locates the index of the element
        System.out.println("What is the index of the name 'Broly': " + linkedList.indexOf("Broly"));

    }
}