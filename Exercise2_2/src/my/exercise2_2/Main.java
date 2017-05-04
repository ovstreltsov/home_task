package my.exercise2_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Дано двузначное число. Найти сумму и произведение его цифр
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите двузначное число ");
        byte s1=sc.nextByte();
        int a=s1/10;
        int b=s1%10;
        int c=a+b;
        int d=a*b;

        System.out.println("Сумма цифр числа равна "+c);
        System.out.println("Произведение цифр числа равно "+d);

    }
}
