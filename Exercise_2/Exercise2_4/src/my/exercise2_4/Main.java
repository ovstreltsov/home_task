package my.exercise2_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// wРешить предыдущую задачу, не использую никаких дополнительных переменных
        // Дано двузначное число. Вывести число, полученное при перестановке цифр исходного числа)
        System.out.println("Введите двузначное число ");
        Scanner sc = new Scanner(System.in);
        byte s1=sc.nextByte();
        System.out.println(s1%10*10+s1/10);

    }
}
