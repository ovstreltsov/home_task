package my.exercise2_10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Дано трехзначное число. Найти сумму и произведение его цифр
        System.out.println("Введите трехзначное число");
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        int T1=T/100;
        int T2=T/10%10;
        int T3=T%10;
        System.out.println("сумму цифр "+(T1+T2+T3));
        System.out.println("произведение цифр "+(T1*T2*T3));

    }
}
