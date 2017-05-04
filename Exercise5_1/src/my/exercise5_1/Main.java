package my.exercise5_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 5.1. Начальный вклад в банке равен 1000 руб. Через каждый месяц размер вклада увеличивается на P процентов от имеющейся суммы
        // (P — вещественное число, 0 < P < 25). По данному P определить, через сколько месяцев размер вклада превысит 1100 руб.,
        // и вывести найденное количество месяцев K (целое число) и итоговый размер вклада S (вещественное число).
        double S, P;
        System.out.println("Please enter P ");
        Scanner sc = new Scanner(System.in);
        P = sc.nextDouble();
        int M = 0; // стартовое число месяцев
        S = 1000; //  начальный вклад

        do {
            S = S + S * P / 100; //сумма увеличивается на процент начисленный за текущиий месяц:
            M++;
        }
        while (S <= 1100); // цикл будет выполнятся пока сумма на счету <= 1100
        System.out.println("Deposit will exceed 1100 rub after "+M+" month");
        System.out.println("Total amount will be: "+S+" rub");
    }
}
