package main;

public class MyLinkedList {

    int size = 0;

    MyLinkedListNode first;
    MyLinkedListNode last;

    public MyLinkedList() {

    }

    public int get(int index) {
        MyLinkedListNode x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x.val;
    }

    public void addAtHead(int val) {
        MyLinkedListNode curr = new MyLinkedListNode(val);
        curr.next = first;
        first = curr;
        size++;
    }

    public void addAtTail(int val) {
        MyLinkedListNode curr = new MyLinkedListNode(val);
        last.next = curr;
        last = curr;
        size++;
    }

    public void addAtIndex(int index, int val) {
        MyLinkedListNode curr = new MyLinkedListNode(val);
        MyLinkedListNode x = first;
        MyLinkedListNode y = first;
        for (int i = 0; i < index - 1; i++) {
            x = x.next;
        }
        for (int i = 0; i < index; i++) {
            y = y.next;
        }
        x.next = curr;
        curr.next = y;
        size++;
    }

    public void deleteAtIndex(int index) {
        MyLinkedListNode x = first;
        MyLinkedListNode y = first;
        for (int i = 0; i < index - 1; i++) {
            x = x.next;
        }
        for (int i = 0; i < index; i++) {
            y = y.next;
        }
        x.next = y;
        size--;
    }

    static class MyLinkedListNode {
        int val;
        MyLinkedListNode next;

        MyLinkedListNode(int x) {
            val = x;
        }
    }

}
