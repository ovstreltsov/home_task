package my.exercise3;

import java.util.Scanner;

public class Main {
    //3.1-3.3.Даны координаты двух различных полей шахматной доски x1, y1, x2, y2 (целые числа, лежащие в диапазоне 1–8).

    public static void main(String[] args) {
	byte x1,y1,x2,y2;
        System.out.println("Please enter the coordinates of two different chessboard fields x1, y1, x2, y2 (integers between 1-8 )");
        Scanner sc = new Scanner(System.in);
        x1= sc.nextByte();
        y1= sc.nextByte();
        x2= sc.nextByte();
        y2= sc.nextByte();
        //3.1 Проверить истинность высказывания: «Данные поля имеют одинаковый цвет».
        System.out.println("Do these fields have the same color?");
        // два поля шахматной доски будут одного цвета, если сумма их координат четная
        if (((x1+x2+y1+y2)%2==0))
            System.out.println("Yes, they have");
        else
            System.out.println("No, they don't");
        //3.2 Проверить истинность высказывания: «Ладья за один ход может перейти с одного поля на другое».
        System.out.println("Can the rook for one move go from one field to another?");
        // ладья ходит только по горизонтали вертикали, т.е для успешного перехода нужно
        // чтобы совпадали или x или y координаты
        if ((x1==x2)||(y1==y2))
            System.out.println("Yes");
        else
            System.out.println("No");
        //Проверить истинность высказывания: «Ферзь за один ход может перейти с одного поля на другое».
        System.out.println("Can the Queen move from one field to another in one move?");
        // ферзь может ходить как ладья, но помимо этого он еще может ходить по диагонали(как слон),
        // для чего требуется добавить еще одно условие - изменение координаты x по модулю должно быть равно изменению координаты y
        boolean isRook = (x1==x2)||(y1==y2);
        boolean isBishop = Math.abs(x1-x2)==Math.abs(y1-y2);
        System.out.println(isRook||isBishop);
    }
}
