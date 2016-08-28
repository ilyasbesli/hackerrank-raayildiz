package me.rayyildiz.hackerrank.thirtydays;

import java.util.List;

/**
 * Created by rayyildiz on 8/28/16.
 */
class Student extends Person {
    private int[] testScores;


    Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }

    public String calculate() {
        int sum = 0;
        for (int score : testScores) {
            sum += score;
        }

        int result = sum / testScores.length;

        if (result >= 90 && result <= 100) {
            return "O";
        } else if (result >= 80 && result < 90) {
            return "E";
        } else if (result >= 70 && result < 80) {
            return "A";
        } else if (result >= 55 && result < 70) {
            return "P";
        } else if (result >= 40 && result < 55) {
            return "D";
        } else if (result < 40) {
            return "T";
        }

        return "";
    }
}
