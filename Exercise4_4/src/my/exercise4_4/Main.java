package my.exercise4_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// 4.4 ���� ������������ ����� A � ����� ����� N (> 0). ��������� ���� ����, ����� �������� ��������� 1 � A + A^2 � A^3 + � + (�1)^N�A^N. �������� �������� �� ������������.
        System.out.println("Please enter two numbers A and N (>0)");
        Scanner sc = new Scanner(System.in);
        float A = sc.nextFloat();
        int N = sc.nextInt();
        float Pow = 1,Sum = 1;
        int Z = -1; // ������������� ����������

        for(int i=1;i<=N;i++)
        {
            Pow = Pow * A;
            Pow = Z * Pow; // �������� �������� �������.
            Sum = Sum + Pow;
        }
        System.out.println("Calculated value: "+Sum);
    }
}
