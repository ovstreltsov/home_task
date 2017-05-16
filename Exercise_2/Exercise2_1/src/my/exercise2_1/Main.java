package my.exercise2_1;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Дано двузначное число. Вывести вначале его левую цифру (десятки), а затем — его правую цифру (единицы).
        // Для нахождения десятков использовать операцию деления нацело,
        // для нахождения единиц — операцию взятия остатка от деления

                Scanner sc = new Scanner(System.in);
                System.out.println("Введите двузначное число ");
                Byte s1=sc.nextByte();
                int a=s1/10;
                int b=s1%10;

                System.out.println(a+" "+b);

            }
}
