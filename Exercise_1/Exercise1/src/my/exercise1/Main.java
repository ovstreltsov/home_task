package my.exercise1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Поменять местами содержимое переменных A и B и вывести новые значения A и B.
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter A,B: ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        A = A + B;
        B = A - B;
        A = A - B;
        System.out.println("A=" + A);
        System.out.println("B=" + B);

    }
}