package my.exercise6_123;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// 6.1 Дан массив из десяти целых чисел. Найти их сумму.
        final int N=10;
        int [] Numbers = new int[N];
        int Sum=0, Prod=1;
        float ArMean=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter elements of array ");
        for(int i=0;i<N;i++)
        {
            Numbers[i] = sc.nextInt();
        }

        for(int i=0;i<N;i++)
        {
            Sum+=Numbers[i];
        }
        System.out.println("Sum = "+Sum);
    // 6.2 Дан массив из десяти целых чисел. Найти их произведение.
        for(int i=0;i<N;i++)
        {
            Prod*=Numbers[i];
        }
        System.out.println("Prod = "+Prod);
    // 6.3 Дан массив из десяти целых чисел. Найти их среднее арифметическое.
        for(int i=0;i<N;i++)
        {
            ArMean+=Numbers[i];
        }
        ArMean=ArMean/N;
        System.out.println("Arithmetic mean = "+ArMean);
    }
}
