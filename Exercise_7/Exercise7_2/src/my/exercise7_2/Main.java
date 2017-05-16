package my.exercise7_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// 7.O.2 Write a program that prints the sum of two random integers between 1 and 6
	// (such as you might get when rolling dice).

        int a = (int) ( Math.random() * 6) + 1;
        int b = (int) ( Math.random() * 6) + 1;
        int Sum = a+b;
        System.out.println("Generated random numbers: "+a+" "+b);
        System.out.println("Sum of generated numbers: "+Sum);
    }
}
