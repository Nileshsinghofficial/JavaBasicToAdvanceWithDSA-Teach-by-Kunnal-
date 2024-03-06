package com.nilesh;

import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        Type Conversion
        int num = (int) input.nextFloat();
        System.out.println("Print this input as a Integer: " + num);
    }
}
