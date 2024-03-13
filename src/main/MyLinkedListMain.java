package main;

import java.util.LinkedList;

public class MyLinkedListMain {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(2);
        myLinkedList.addAtIndex(2, 200);
        System.out.println(myLinkedList);;
    }
}
