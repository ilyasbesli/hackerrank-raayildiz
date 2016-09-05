package me.rayyildiz.hackerrank.thirtydays;

/**
 * Created by rayyildiz on 9/5/16.
 */
public class Calculator implements AdvancedArithmetic {
    @Override
    public int divisorSum(int n) {
        int sum = 0;
        for(int i=1; i<= n;i++){
            if ( n % i == 0) sum +=i;
        }
        return sum;
    }
}
