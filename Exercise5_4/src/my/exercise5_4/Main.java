package my.exercise5_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// 5.4. Дано целое число N (> 1). Последовательность чисел Фибоначчи FK определяется следующим образом:
	// F1 = 1, F2 = 1, FK = FK–2 + FK–1, K = 3, 4, … . Проверить, является ли число N числом Фибоначчи.
	// Если является, то вывести True, если нет — вывести False.
        System.out.println("Please enter N(>1) ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int F1 = 1, F2 = 1, c;
        // считаем следующее число из ряда Фибоначчи в цикле, пока введенное нами число N больше
        while (N > F2)
        {
            c = F2;
            F2 = F1 + F2;
            F1 = c;
        }

        //проверяем, является ли наше число числом Фибоначчи
        System.out.println(N == F2);
    }
}
