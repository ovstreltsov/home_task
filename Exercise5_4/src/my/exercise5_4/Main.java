package my.exercise5_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// 5.4. ���� ����� ����� N (> 1). ������������������ ����� ��������� FK ������������ ��������� �������:
	// F1 = 1, F2 = 1, FK = FK�2 + FK�1, K = 3, 4, � . ���������, �������� �� ����� N ������ ���������.
	// ���� ��������, �� ������� True, ���� ��� � ������� False.
        System.out.println("Please enter N(>1) ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int F1 = 1, F2 = 1, c;
        // ������� ��������� ����� �� ���� ��������� � �����, ���� ��������� ���� ����� N ������
        while (N > F2)
        {
            c = F2;
            F2 = F1 + F2;
            F1 = c;
        }

        //���������, �������� �� ���� ����� ������ ���������
        System.out.println(N == F2);
    }
}
