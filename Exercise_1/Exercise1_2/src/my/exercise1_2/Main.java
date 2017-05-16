package my.exercise1_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Даны переменные A, B, C. Изменить их значения, переместив содержимое A в B, B — в C, C — в A, и вывести новые значения переменных A, B, C
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter A,B,C: ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int T1,T2;
        T1=B;
        T2=C;
        B=A;
        C=T1;
        A=T2;
        System.out.println("A=" + A);
        System.out.println("B=" + B);
        System.out.println("C=" + C);
    }
}
