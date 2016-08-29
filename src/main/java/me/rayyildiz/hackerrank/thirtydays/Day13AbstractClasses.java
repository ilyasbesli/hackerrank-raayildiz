package me.rayyildiz.hackerrank.thirtydays;

import java.util.Scanner;

/**
 * Created by rayyildiz on 8/29/16.
 */
public class Day13AbstractClasses {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        String author=sc.nextLine();
        int price=sc.nextInt();
        Book new_novel=new MyBook(title,author,price);
        new_novel.display();

    }
}
