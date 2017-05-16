package my.exercise4_6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// 4.6. ���� ����� ����� N (> 1). ������������������ ����� ��������� FK (������ ����) ������������ ��������� �������:
	// F1 = 1, F2 = 1, FK = F_K�2 + F_K�1, K = 3, 4, � . ������� �������� F1, F2, ..., FN.
        System.out.println("Please enter integer number N (>1)");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int F1=1,F2=1,FK;
        System.out.println("Fibonacci numbers:");
        System.out.println("F1= "+F1);
        System.out.println("F2= "+F2);

        for(int k=3;k<=N;k++)
        {
            FK=F1+F2;
            System.out.println("F"+k+"= "+FK);
            F1=F2;
            F2=FK;
        }
    }
}
