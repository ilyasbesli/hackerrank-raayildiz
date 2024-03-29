package me.rayyildiz.hackerrank.thirtydays;


/**
 * Created by rayyildiz on 9/15/16.
 */
public class Day21Generics {


    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        printArray( intArray  );
        printArray( stringArray );

        if(Day21Generics.class.getDeclaredMethods().length > 2){
            System.out.println("You should only have 1 method named printArray.");
        }
    }

    private static void printArray(Object[] array) {
        for(Object obj : array){
            System.out.println(obj);
        }
    }
}
