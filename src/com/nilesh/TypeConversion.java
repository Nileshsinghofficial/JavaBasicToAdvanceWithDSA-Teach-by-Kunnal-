package com.nilesh;

import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        Type Conversion
//        int num = (int) input.nextFloat();
//        System.out.println("Print this input as a Integer: " + num);

//        Automatic type promotion in expressions
        int a = 600;
        byte b = (byte)(a);
//        value(600) % 256 = what come remainder ? (88) => 256 * 2 + 88 = 600
        System.out.println(b);

    }
}
