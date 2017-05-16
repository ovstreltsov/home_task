package my.exercise1_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Даны переменные A, B, C. Изменить их значения, переместив содержимое A в C, C — в B, B — в A, и вывести новые значения переменных A, B, C
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter A,B,C: ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int T1,T2;
        T1=C;
        T2=B;
        C=A;
        B=T1;
        A=T2;
        System.out.println("A=" + A);
        System.out.println("B=" + B);
        System.out.println("C=" + C);
    }
}
