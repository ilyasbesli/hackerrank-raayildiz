package me.rayyildiz.hackerrank.thirtydays;

import java.io.*;
import java.util.*;

/**
 * Created by rayyildiz on 9/5/16.
 */
public class Day19Interfaces {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
