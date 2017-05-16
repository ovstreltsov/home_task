package my.exercise3_4;

import java.util.Scanner;

public class Main {

    //Мастям игральных карт присвоены порядковые номера: 1 — пики, 2 — трефы, 3 — бубны, 4 — червы. Достоинству карт, старших десятки, присвоены номера:
    // 11 — валет, 12 — дама, 13 — король, 14 — туз. Даны два целых числа: N — достоинство (6 <= N <= 14) и M — масть карты (1 ? M ? 4).
    // Вывести название соответствующей карты вида «шестерка бубен», «дама червей», «туз треф» и т. п.

    public static void main(String[] args) {
        byte N,M;
        System.out.println("Введите достоинство N и масть карты M:");
        Scanner sc = new Scanner(System.in);
        N = sc.nextByte();
        M = sc.nextByte();
        switch (N)
        {
            case 6:
                System.out.print("шестёрка ");
                break;
            case 7:
                System.out.print("семёрка ");
                break;
            case 8:
                System.out.print("восьмерка ");
                break;
            case 9:
                System.out.print("девятка ");
                break;
            case 10:
                System.out.print("десятка ");
                break;
            case 11:
                System.out.print("валет ");
                break;
            case 12:
                System.out.print("дама ");
                break;
            case 13:
                System.out.print("король ");
                break;
            case 14:
                System.out.print("туз ");
                break;
            default:
                System.out.println("Указано неверное достоинство карты");
                break;
        }

        switch (M)
        {
            case 1:
                System.out.println("пик");
                break;
            case 2:
                System.out.println("треф");
                break;
            case 3:
                System.out.println("бубен");
                break;
            case 4:
                System.out.println("червей");
                break;
            default:
                System.out.println("Указана неверная масть карты");
                break;
        }
    }
}
