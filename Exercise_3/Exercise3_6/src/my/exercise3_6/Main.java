package my.exercise3_6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//    В восточном календаре принят 60-летний цикл, состоящий из 12-летних подциклов, обозначаемых названиями цвета:
	// зеленый, красный, желтый, белый и черный. В каждом подцикле годы носят названия животных:
	// крысы, коровы, тигра, зайца, дракона, змеи, лошади, овцы, обезьяны, курицы, собаки и свиньи.
	// По номеру года определить его название, если 1984 год — начало цикла: «год зеленой крысы»

        int Year;
        System.out.println("Введите численный номер года: ");
                Scanner sc = new Scanner(System.in);
        Year = sc.nextInt();
        System.out.print("год ");
        switch (Year % 10)
        {
            case 0: case 1:
                System.out.print("бел");
                break;
            case 2: case 3:
                System.out.print("черн");
                break;
            case 4: case 5:
                System.out.print("зелён");
                break;
            case 6: case 7:
                System.out.print("красн");
                break;
            case 8: case 9:
                System.out.print("жёлт");
                break;
        }
        switch (Year % 12)
        {
            case 0: case 1 : case 2: case 3: case 4:case 5: case  9: case 10: case 11:
                System.out.print("ой ");
                break;
            case 6: case 7: case 8:
                System.out.print("ого ");
                break;
        }
         switch ((Year + 8) % 12)
        {
            case 0:
                System.out.print("крысы");
                break;
            case 1:
                System.out.print("коровы");
                break;
            case 2:
                System.out.print("тигра");
                break;
            case 3:
                System.out.print("зайца");
                break;
            case 4:
                System.out.print("дракона");
                break;
            case 5:
                System.out.print("змеи");
                break;
            case 6:
                System.out.print("лошади");
                break;
            case 7:
                System.out.print("овцы");
                break;
            case 8:
                System.out.print("обезьяны");
                break;
            case 9:
                System.out.print("курицы");
                break;
            case 10:
                System.out.print("собаки");
                break;
            case 11:
                System.out.print("свиньи");
                break;
        }
    }
}
