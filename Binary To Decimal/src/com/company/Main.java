package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n \n Binary to Decimal and Decimal To Binary Converter");
            System.out.println("1.Decimal To Binary");
            System.out.println("2.Binary To Decimal");
            System.out.println("3.Exit");
            System.out.print("Choice:");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:System.out.print("Enter decimal number:");
                       int num = scanner.nextInt();
                       System.out.println("Binary number is" + decimalToBinary(num));
                       break;
                case 2:System.out.print("Enter Binary Number:");
                       int bnum = scanner.nextInt();
                       System.out.println("Decimal Number is:" + binaryToDecimal(bnum));
                       break;
                case 3:System.exit(0);
                default:System.out.println("Invalid Choice");
            }
        }
    }

    private static StringBuilder decimalToBinary(int decimal){
        int rem;
        StringBuilder fumbler = new StringBuilder();
        while (decimal > 0){
            rem = decimal % 2;
            decimal = decimal / 2;
            fumbler.append(rem);
        }
        return fumbler.reverse();
    }

    private static int binaryToDecimal(int binary){
        StringBuilder bin = new StringBuilder(Integer.toString(binary));
        bin = bin.reverse();
        int fumbler = 0;
        for(int i=0;i<bin.length();i++){
            fumbler += Integer.parseInt(String.valueOf(bin.charAt(i)))*Math.pow(2,i);
        }
        return fumbler;
    }
}
