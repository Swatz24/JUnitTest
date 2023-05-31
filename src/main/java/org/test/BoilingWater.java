package org.test;

import java.util.Scanner;

public class BoilingWater {

    public String isWaterBoiling(int number){
        if(number >= 212){
            System.out.println("Water is boiling!");
            return "Water is boiling!";
        }
        else{
            System.out.println("Water is not boiling yet!");
            return "Water is not boiling yet!";
        }
    }

    public static void main(String[] args) {
        System.out.printf("Enter a number greater than 212:\n");
        int number ;
        Scanner input = new Scanner(System.in);
        number = Integer.valueOf(input.nextLine());
        BoilingWater obj = new BoilingWater();
        obj.isWaterBoiling(number);
    }

}
