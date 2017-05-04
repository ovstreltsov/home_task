package my.exercise1_6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Дано значение температуры T в градусах Цельсия. Определить значение этой же температуры в градусах Фаренгейта.
        // Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением: TC=(TF–32)·5/9.
        // Ввод температуры организовать через параметры командной строки
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter TC");
        int TC = sc.nextInt();
        int TF=9*TC/5+32;
        System.out.println("TF=" + TF);
    }
}
