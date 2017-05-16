package my.exercise2_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Дано двузначное число. Вывести число, полученное при перестановке цифр исходного числа
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите двузначное число ");
        byte s1=sc.nextByte();
        int a=s1/10;
        int b=s1%10;

        System.out.println(b*10+a);

    }
}
