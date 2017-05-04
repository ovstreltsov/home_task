package my.exercise4_123;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// 4.1 Даны два целых числа A и B (A < B). Найти сумму всех целых чисел от A до B включительно.
        int A,B,Sum=0;
        System.out.println("Please enter two numbers A,B (A<B)");
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();

        for(int i=A;i<=B;i++)
        {
            Sum=Sum+i;
        }
        // а можно конечно вспомнить формулу суммы арифметической прогрессии, и обойтись без цикла
        //Sum=(A+B)*(B-A+1)/2;

        //4.2 Даны два целых числа A и B (A < B). Найти произведение всех целых чисел от A до B включительно.
        int Product=1;
        for(int i=A;i<=B;i++)
        {
            Product=Product*i;
        }

        //4.3 Даны два целых числа A и B (A < B). Найти сумму квадратов всех целых чисел от A до B включительно.
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
