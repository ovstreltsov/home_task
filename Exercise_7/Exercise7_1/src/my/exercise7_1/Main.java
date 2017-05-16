package my.exercise7_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// 7.O.1 Write a program that takes two int values a and b from the command line and prints a random integer
	// between a and b.
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter integers a,b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int randomNumber = (int) ( Math.random() * ((b-a)+1) ) + a;
        System.out.println("Generated random number: "+randomNumber);
    }
}
