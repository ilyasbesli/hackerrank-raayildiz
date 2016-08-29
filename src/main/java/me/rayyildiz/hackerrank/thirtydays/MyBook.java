package me.rayyildiz.hackerrank.thirtydays;

/**
 * Created by rayyildiz on 8/29/16.
 */
class MyBook extends Book {
    private int price;
    public MyBook(String title, String author, int price) {
        super(title, author);

        this.price = price;
    }


    @Override
    void display() {
        System.out.println("Title: "+ title + "\nAuthor: "+author+"\nPrice: "+price);
    }
}
