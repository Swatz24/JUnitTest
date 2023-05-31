package org.test;

public class SumDouble {
    public int sumDouble(int a, int b) {
        // Store the sum in a local variable
        int sum = a + b;

        // Double it if a and b are the same
        if (a == b) {
            sum = sum * 2;
        }

        return sum;
    }

    public static void main(String[] args) {
        SumDouble sumObj = new SumDouble();
        System.out.println("SumDouble " + sumObj.sumDouble(2,2));
        System.out.println("SumDouble " + sumObj.sumDouble(2,3));

    }
}

