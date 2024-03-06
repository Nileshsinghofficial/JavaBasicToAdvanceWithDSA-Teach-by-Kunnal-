package com.nilesh;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int num1 = input.nextInt();
        System.out.println("Enter Second Number: ");
        int num2 = input.nextInt();
        int Sum = num1 + num2;
        System.out.println("Total number is: " + Sum);
    }
}

