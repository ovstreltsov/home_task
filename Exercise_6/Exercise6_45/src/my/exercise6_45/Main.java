package my.exercise6_45;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// 6.4 ƒано целое число K и массив из дес€ти целых ненулевых чисел. ¬ывести номер первого числа в массиве,
	// большего K. ≈сли таких чисел нет, то вывести 0.
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
        System.out.println("ID of first number > K: "+j); // не забываем что нумераци€ элементов массива начинаетс€ с 0

    // 6.5 ƒано целое число K и массив из дес€ти целых ненулевых чисел. ¬ывести номер последнего числа в массиве,
    // большего K. ≈сли таких чисел нет, то вывести 0.
        int lastId=0;
        for(i=0;i<N;i++)
        {
            if(Numbers[i]>K)
                lastId=i;
        }
        System.out.println("ID of last number > K: "+lastId);
    }
}
