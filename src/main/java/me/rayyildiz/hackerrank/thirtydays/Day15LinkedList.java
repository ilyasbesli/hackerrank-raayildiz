package me.rayyildiz.hackerrank.thirtydays;

import java.util.Scanner;

/**
 * Created by rayyildiz on 8/31/16.
 */
public class Day15LinkedList {

    public static  Node insert(Node head,int data) {
        Node newHead = new Node(data);
        if ( head == null) return newHead;

        if ( head.next == null) {
            head.next = newHead;
            return head;
        }

        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }

        temp.next = newHead;
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();

    }
}
