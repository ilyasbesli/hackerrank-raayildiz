package me.rayyildiz.hackerrank.thirtydays;

import java.util.Scanner;

/**
 * Created by rayyildiz on 9/1/16.
 */
public class Day16ExceptionsStringToInteger {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();


        try {
            int i = Integer.parseInt(S);

            System.out.println(i);

        }catch (NumberFormatException e){
            System.out.println("Bad String");
        }
        in.close();
    }
}
