package my.exercise4_123;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// 4.1 ���� ��� ����� ����� A � B (A < B). ����� ����� ���� ����� ����� �� A �� B ������������.
        int A,B,Sum=0;
        System.out.println("Please enter two numbers A,B (A<B)");
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();

        for(int i=A;i<=B;i++)
        {
            Sum=Sum+i;
        }
        // � ����� ������� ��������� ������� ����� �������������� ����������, � �������� ��� �����
        //Sum=(A+B)*(B-A+1)/2;

        //4.2 ���� ��� ����� ����� A � B (A < B). ����� ������������ ���� ����� ����� �� A �� B ������������.
        int Product=1;
        for(int i=A;i<=B;i++)
        {
            Product=Product*i;
        }

        //4.3 ���� ��� ����� ����� A � B (A < B). ����� ����� ��������� ���� ����� ����� �� A �� B ������������.
        int SquaresSum=0;
        for(int i=A;i<=B;i++)
        {
            SquaresSum=SquaresSum+i*i;
        }

        System.out.println("Sum of all numbers between A and B equals "+Sum);
        System.out.println("Product of all numbers between A and B equals "+Product);
        System.out.println("Sum of squares for all numbers between A and B equals "+SquaresSum);
    }
}
