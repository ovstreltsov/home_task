package my.exercise1_7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Дано значение температуры T в градусах Фаренгейта.
        // Определить значение этой же температуры в градусах Цельсия.
        // Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношеним: TC=(TF–32)·5/9
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter TF");
        int TF = sc.nextInt();
        int TC=(TF-32)*5/9;
        System.out.println("TC=" + TC);
    }
}
