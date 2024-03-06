package com.nilesh;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
//        System.out.println("Enter Your Number: ");
//        int rollno = input.nextInt();
//        System.out.println("Your roll number is " + rollno);

//        int a = 203_000_000;
//        System.out.println(a);
        System.out.println("If you want only first sentence: ");
        String name = input.next();
        System.out.println(name);

        String names = input.nextLine();
        System.out.println("If you Want print full sentence then do its :");
        System.out.println(names);

    }
}
