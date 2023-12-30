package com.xworkz.maxmin;

import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseLinkedList {
    public static void main(String[] args) {
        // Create a linked list and add elements
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);

        System.out.println("Original Linked List: " + ll);

        // Create a new linked list by reversing the order
        LinkedList<Integer> ll1 = new LinkedList<>();
        ListIterator<Integer> iterator = ll.listIterator(ll.size());

        while (iterator.hasPrevious()) {
            ll1.add(iterator.previous());
        }

        System.out.println("Reversed Linked List: " + ll1);
    }
}

