package my.exercise7_5;

public class Main {

    public static void main(String[] args) {
	// 7.O.4 �������� ��������� ������������ ����� ���� ������ ����������
	// ��� �������� ��������� ������ ������ �������������� �����.
        try {
            int N = Integer.parseInt(args[0]);
            int Sum = 0;
            while (N > 0) {
                Sum += N % 10; // ������� ������� �� ������� ����� �� 10
                N = N / 10; // ����� ������ �� 10
            }
            System.out.println("Sum of digits: "+Sum);
        }
        catch (Exception e)
        {
            System.out.println("Error, please check arguments!");
        }
    }
}
