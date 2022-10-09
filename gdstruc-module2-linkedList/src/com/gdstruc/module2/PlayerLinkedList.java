package com.gdstruc.module2;

import javax.xml.namespace.QName;

public class PlayerLinkedList {
    private PlayerNode head;

    // function to add a new player to the front of the linked lists
    public void addToFront(Player player) {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }

    // function to print the elements of the linked list
    public void printList() {
        System.out.print("HEAD -> ");
        PlayerNode curent = head;

        while (curent != null) {
            System.out.print(curent.getPlayer() + " -> ");
            curent = curent.getNextPlayer();
        }

        System.out.print(" NULL\n");
    }

    // function to remove the player in front of the linked lists
    public void removeFirst() {
         if (head != null)
       {
            head = head.getNextPlayer();
       }
    }

    public void sizeOfList() {
        int count = 0;
        PlayerNode curent = head;

        while (curent != null) {
            count++;
            curent = curent.getNextPlayer();
        }
        System.out.print("\nHow many elements are present: " + count + "\n\n");
    }

    public boolean containsElement(String element) {
        PlayerNode curent = head;
        while (curent != null) {
            if (element.equals(curent.getPlayer()))
            {
                return true;
            }
            curent = curent.getNextPlayer();
        }
        return false;
    }

    public int indexOf(String element) {

        int index = 0;
        PlayerNode curent = head;

        while(curent != null) {
            if(curent.getPlayer().equals(element)) {
                return index;
            }
            curent = curent.getNextPlayer();
            index++;
        }
        return -1;
    }
}