package my.exercise4_5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// 4.5.  ���� ����� ����� N (> 0). ����� ������������ N! = 1�2���N (N����������).
	// ����� �������� �������������� ������������, ��������� ��� ������������ � ������� ������������ ����������
	// � ������� ��� ��� ������������ �����.
        System.out.println("Please enter integer number N (>0)");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double Factorial=1.0;

        for(int i=1;i<=N;i++)
        {
            Factorial=Factorial*i;
        }
        System.out.println("Calculated value: "+Factorial);
}
}
