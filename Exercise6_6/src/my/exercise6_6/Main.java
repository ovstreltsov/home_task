package my.exercise6_6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// 6.6 ƒано вещественное число B, целое число N и массив из N целых чисел, упор€доченных по возрастанию.
	// ¬ывести элементы массива вместе с числом B, сохран€€ упор€доченность выводимых чисел.
        System.out.println("Please enter B: ");
        Scanner sc = new Scanner(System.in);
        float B = sc.nextFloat();
        System.out.println("Please enter N: ");
        int N = sc.nextInt();
        int [] Numbers = new int[N];

        System.out.println("Please enter elements of array in ascending order: ");
        for(int i=0;i<N;i++)
        {
            Numbers[i] = sc.nextInt();
        }
        boolean flag=false;
        for(int i=0;i<N;i++)
        {
             if ((Numbers[i]>B)&&(flag==false))
            {
                System.out.print(B+" ");
                flag=true;
            }
            System.out.print(Numbers[i]+" ");
        }

    }
}
