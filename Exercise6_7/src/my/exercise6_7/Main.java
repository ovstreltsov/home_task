package my.exercise6_7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// 6.7 ���� ����� ����� N � ������ �� N ����� �����, ������������� �� �����������. ������ ����� ����� ���������
	// ���������� ��������. ������� � ��� �� ������� ��� ��������� �������� ������� �������.
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter N: ");
        int N = sc.nextInt();
        int [] Numbers = new int[N];

        System.out.println("Please enter elements of array in ascending order: ");
        for(int i=0;i<N;i++)
        {
            Numbers[i] = sc.nextInt();
        }

        int b=Numbers[1];
        for(int i=0;i<N;i++)
        {
            if (Numbers[i]!=b)
                System.out.print(Numbers[i]+" ");
            b=Numbers[i];
        }
    }
}
