package me.rayyildiz.hackerrank.thirtydays;

import java.util.Scanner;

/**
 * Created by rayyildiz on 9/19/16.
 */
public class Day29BitwiseAND {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        for(int i = 0; i < c; i++){
            int n = in.nextInt();
            int k = in.nextInt();
            if(((k-1)|k) > n && k%2==0){
                System.out.println(k-2);
            }else{
                System.out.println(k-1);
            }
        }
    }
}
