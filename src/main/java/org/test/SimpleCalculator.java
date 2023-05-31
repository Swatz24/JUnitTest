package org.test;

public class SimpleCalculator {
    public int add(int a, int b){
        return a+b;
    }



    public static void main(String[] args) {

        SimpleCalculator a = new SimpleCalculator();
        System.out.println("Addition: " + a.add(2,3));

    }
}


