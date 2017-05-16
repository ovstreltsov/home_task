package my.exercise1_5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Дано число A. Вычислить A^8, используя вспомогательную переменную и три операции умножения. Для этого последовательно находить A^2, A^4, A^8. Вывести все найденные степени числа A
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter A");
        int A = sc.nextInt();
        int A1=A*A;
        A1=A1*A1;
        A=A1*A1;
        System.out.println("A=" + A);
    }
}
