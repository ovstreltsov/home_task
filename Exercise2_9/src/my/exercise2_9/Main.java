package my.exercise2_9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Дано четырехзначное число. Проверить истинность высказывания:
        // «Данное число читается одинаково слева направо и справа налево» (т.е. является палиндромом)
        System.out.println("Введите четрехзначное число");
        Scanner sc = new Scanner(System.in);
        int Q=sc.nextInt();
        int Q1=Q/1000;
        int Q2=Q/100%10;
        int Q3=Q/10%10;
        int Q4=Q%10;
        int P=Q4*1000+Q3*100+Q2*10+Q1;
        if (P==Q)
        System.out.println("Данное число является палиндромом");
        else System.out.println("Данное число не является палиндромом");


    }
}
