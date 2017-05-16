package my.exercise5_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//5.3 Дано целое число N (> 1). Если оно является простым, то есть не имеет положительных делителей,
	// кроме 1 и самого себя, то вывести True, иначе вывести False.
        System.out.println("Please enter N(>1) ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int i;
        boolean f;
        if (N == 1)
            f = false; // число 1 не считается простым
        else
        if (N == 2)
            f = true; // 2 - первое простое число
        else

        if (N%2 == 0)
            f = false; // четное число не может быть простым
        else // теперь проверим оставшиеся нечетные числа
        {
            i = 3; // начинаем с наименьшего нечетного простого числа
            f = true;

            do {

                if (N % i == 0) // если текущее число i является делителем N, значит N составное число
                    f = false;
                else
                    i = i + 2; // иначе увеличиваем i на 2 (поскольку мы проверяем нечетные числа)
            }
            while ((i * i <= N)&&f); // проверяем значения i, квадрат которых <= N, дальше делители начнут повторяться
        }

        System.out.println(f); // true - простое, false - составное
    }
}
