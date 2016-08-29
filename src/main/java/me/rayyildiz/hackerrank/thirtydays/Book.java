package me.rayyildiz.hackerrank.thirtydays;

/**
 * Created by rayyildiz on 8/29/16.
 */
abstract class Book {
    String title;
    String author;
    Book(String t,String a){
        title=t;
        author=a;
    }
    abstract void display();
}
