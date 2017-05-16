package my.exercise3_5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Дано целое число в диапазоне 100–999. Вывести строку-описание данного числа, например:
        // 256 — «двести пятьдесят шесть», 814 — «восемьсот четырнадцать».
        int Number;
        System.out.println("Введите целое число в диапазоне 100–999:");
        Scanner sc = new Scanner(System.in);
        Number = sc.nextInt();
        int S = Number / 100;
        int D = (Number % 100) / 10;
        int E = Number % 10;
        String[] Sotni = {"сто ", "двести ", "триста ", "четыреста ", "пятсот ", "шестьсот ", "семьсот ", "восемьсот ", "девятьсот "};
        String[] Desyatki = {"","десять ","двадцать ", "тридцать ", "сорок ", "пятьдесят ", "шестьдесят ", "семьдесят ", "восемьдесят ", "девяносто "};
        String[] DesyatkiP = {"десять ","одиннадцать ", "двенадцать ", "тринадцать ", "четырнадцать ", "пятнадцать ", "шестнадцать ", "семнадцать ", "восемнадцать ","девятнадцать"};
        String[] Edinitsy = {"","один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
        if (D==1)
            System.out.println(Sotni[S-1]+DesyatkiP[E]);
        else
            System.out.println("Число:"+Sotni[S-1]+Desyatki[D]+Edinitsy[E]);

    }

}
