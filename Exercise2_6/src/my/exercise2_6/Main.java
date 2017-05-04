package my.exercise2_6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// С начала суток прошло N секунд (N — целое). Найти количество полных часов, минут и секунд,
        // прошедших с начала последних суток
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество прошедших секунд ");
        int s1=sc.nextInt();
        int h=s1/3600;
        int m=(s1-h*3600)/60;
        int s= s1-h*3600-m*60;

        System.out.println("с начала суток прошло: часов "+h+" минут "+m+" секунд "+s);

    }
}
