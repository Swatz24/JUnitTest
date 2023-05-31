package org.test;

import java.util.Scanner;
public class TestScore {

    public String testScore(int score){
        if (score <= 100 && score >= 90) {
            System.out.println("Your grade is A :)");
            return "A";
        } else if (score < 90 && score >= 80) {
            System.out.println("Your grade is B");
            return "B";
        } else if (score < 80 && score >= 70) {
            System.out.println("Your grade is C");
            return "C";
        } else if (score < 70 && score >= 60) {
            System.out.println("Your grade is D");
            return "D";
        } else if (score < 60 && score > 0) {
            System.out.println("Your grade is F");
            return "F";
        }else {
            System.out.println("Please enter number ONLY between 0 and 100.");
            return "Error";
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 to 100:");
        int score = input.nextInt();
        TestScore test = new TestScore();
       String grade =  test.testScore(score);
    }
}
