package my.exercise6_45;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// 6.4 ���� ����� ����� K � ������ �� ������ ����� ��������� �����. ������� ����� ������� ����� � �������,
	// �������� K. ���� ����� ����� ���, �� ������� 0.
        final int N=10;
        int [] Numbers = new int[N];
        int i=0,j=0,K=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter K: ");
        K = sc.nextInt();

        System.out.println("Please enter elements of array(not 0): ");
        for(i=0;i<N;i++)
        {
            Numbers[i] = sc.nextInt();
        }

        while (Numbers[j]<=K)
        {
            j++;
        }
        System.out.println("ID of first number > K: "+j); // �� �������� ��� ��������� ��������� ������� ���������� � 0

    // 6.5 ���� ����� ����� K � ������ �� ������ ����� ��������� �����. ������� ����� ���������� ����� � �������,
    // �������� K. ���� ����� ����� ���, �� ������� 0.
        int lastId=0;
        for(i=0;i<N;i++)
        {
            if(Numbers[i]>K)
                lastId=i;
        }
        System.out.println("ID of last number > K: "+lastId);
    }
}
