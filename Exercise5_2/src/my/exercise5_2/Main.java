package my.exercise5_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 5.2.  ƒано целое число N (> 0). »спользу€ операции делени€ нацело и вз€ти€ остатка от делени€, вывести все его цифры,
        // начина€ с самой правой (разр€да единиц).
        System.out.println("Please enter N(>0) ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("Digits of the number, beginning from the right one:");
        while (N > 0)
        {
            System.out.println(N%10); // находим остаток от делени€ числа на 10
            N = N/10; // делим нацело на 10
        }

    }
}