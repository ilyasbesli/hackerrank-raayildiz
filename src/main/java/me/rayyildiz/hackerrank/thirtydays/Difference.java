package me.rayyildiz.hackerrank.thirtydays;

/**
 * Created by rayyildiz on 8/30/16.
 */
public class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements){
        this.elements = elements;
    }


    public void computeDifference(){
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for(int element:elements) {
            if ( element < min) min = element;
            if ( element > max) max = element;
        }

        this.maximumDifference = max - min;
    }


}
