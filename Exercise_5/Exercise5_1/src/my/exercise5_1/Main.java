package my.exercise5_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 5.1. ��������� ����� � ����� ����� 1000 ���. ����� ������ ����� ������ ������ ������������� �� P ��������� �� ��������� �����
        // (P � ������������ �����, 0 < P < 25). �� ������� P ����������, ����� ������� ������� ������ ������ �������� 1100 ���.,
        // � ������� ��������� ���������� ������� K (����� �����) � �������� ������ ������ S (������������ �����).
        double S, P;
        System.out.println("Please enter P ");
        Scanner sc = new Scanner(System.in);
        P = sc.nextDouble();
        int M = 0; // ��������� ����� �������
        S = 1000; //  ��������� �����

        do {
            S = S + S * P / 100; //����� ������������� �� ������� ����������� �� �������� �����:
            M++;
        }
        while (S <= 1100); // ���� ����� ���������� ���� ����� �� ����� <= 1100
        System.out.println("Deposit will exceed 1100 rub after "+M+" month");
        System.out.println("Total amount will be: "+S+" rub");
    }
}
