package my.exercise4_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// 4.4 ƒано вещественное число A и целое число N (> 0). »спользу€ один цикл, найти значение выражени€ 1 Ц A + A^2 Ц A^3 + Е + (Ц1)^NЈA^N. ”словный оператор не использовать.
        System.out.println("Please enter two numbers A and N (>0)");
        Scanner sc = new Scanner(System.in);
        float A = sc.nextFloat();
        int N = sc.nextInt();
        float Pow = 1,Sum = 1;
        int Z = -1; // промежуточна€ переменна€

        for(int i=1;i<=N;i++)
        {
            Pow = Pow * A;
            Pow = Z * Pow; // умножаем значение степени.
            Sum = Sum + Pow;
        }
        System.out.println("Calculated value: "+Sum);
    }
}
