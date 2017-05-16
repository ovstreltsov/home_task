package my.exercise3_7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Даны два целых числа: D (день) и M (месяц), определяющие правильную дату. Вывести знак Зодиака, соответствующий
	// этой дате: «Водолей» (20.1–18.2), «Рыбы» (19.2–20.3), «Овен» (21.3–19.4), «Телец» (20.4–20.5),
	// «Близнецы» (21.5–21.6), «Рак» (22.6–22.7), «Лев» (23.7–22.8), «Дева» (23.8–22.9), «Весы» (23.9–22.10),
	// «Скорпион» (23.10–22.11), «Стрелец» (23.11–21.12), «Козерог» (22.12–19.1).

        byte D,M;
        System.out.println("Введите день D и месяц M: ");
        Scanner sc = new Scanner(System.in);
        D = sc.nextByte();
        M = sc.nextByte();
        switch(M) {
            case 1:
                if (D >= 20)
                    System.out.print("Водолей");
                else System.out.print("Козерог");
                break;
            case 2:
                if (D >= 19)
                    System.out.print("Рыбы");
                else System.out.print("Водолей");
                break;
            case 3:
                if (D >= 21)
                    System.out.print("Овен");
                else System.out.print("Рыбы");
                break;
             case 4:
                if (D >= 20)
                    System.out.print("Телец");
                else System.out.print("Овен");
                break;
            case 5:
                if (D >= 21)
                    System.out.print("Близнецы");
            else System.out.print("Телец");
                break;
            case 6:
                if (D >= 22)
                    System.out.print("Рак");
                else System.out.print("Близнецы");
                break;
            case 7:
                if (D >= 23)
                    System.out.print("Лев");
                else System.out.print("Рак");
                break;
            case 8:
                if (D >= 23)
                    System.out.print("Дева");
                else System.out.print("Лев");
                break;
            case 9:
                if (D >= 23)
                    System.out.print("Весы");
                    else System.out.print("Дева");
                break;
            case 10:
                if (D >= 23)
                    System.out.print("Скорпион");
                else System.out.print("Весы");
                break;
              case 11:
                if (D >= 23)
                    System.out.print("Стрелец");
                else System.out.print("Скорпион");
                  break;
            case 12:
                if (D >= 22)
                    System.out.print("Козерог");
                else System.out.print("Стрелец");
                break;
        }
    }
}
