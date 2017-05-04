package my.exercise2_7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Дни недели пронумерованы следующим образом: 1 — понедельник, 2 — вторник, …, 6 — суббота, 7 — воскресенье.
        // Дано целое число K, лежащее в диапазоне 1–365. Определить номер дня недели для K-го дня года, если известно,
        // что в этом году 1 января было средой.

        System.out.println("Введите K");
        Scanner sc = new Scanner(System.in);
        int K=sc.nextInt();
        int K1=(K+2)%7;
        if (K1==0) K1=7;
        System.out.println("номер дня недели для K-го дня года "+K1);
    }
}
