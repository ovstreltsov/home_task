package my.exercise5_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//5.3 ���� ����� ����� N (> 1). ���� ��� �������� �������, �� ���� �� ����� ������������� ���������,
	// ����� 1 � ������ ����, �� ������� True, ����� ������� False.
        System.out.println("Please enter N(>1) ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int i;
        boolean f;
        if (N == 1)
            f = false; // ����� 1 �� ��������� �������
        else
        if (N == 2)
            f = true; // 2 - ������ ������� �����
        else

        if (N%2 == 0)
            f = false; // ������ ����� �� ����� ���� �������
        else // ������ �������� ���������� �������� �����
        {
            i = 3; // �������� � ����������� ��������� �������� �����
            f = true;

            do {

                if (N % i == 0) // ���� ������� ����� i �������� ��������� N, ������ N ��������� �����
                    f = false;
                else
                    i = i + 2; // ����� ����������� i �� 2 (��������� �� ��������� �������� �����)
            }
            while ((i * i <= N)&&f); // ��������� �������� i, ������� ������� <= N, ������ �������� ������ �����������
        }

        System.out.println(f); // true - �������, false - ���������
    }
}
