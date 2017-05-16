package CarLoan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// 7.O.3 Write a program CarLoan.java that reads in three command-line arguments P, Y, and R and calculates
	// the monthly payments you would have to make over Y years to pay off a P dollar loan at R per cent interest
	// compounded monthly. The formula is: payment =  Pr / 1  - (1 + r)^(-n) ,  where n = 12 * Y, r = R / (12 * 100)
        try {
            double P = Double.parseDouble(args[0]);
            double Y = Double.parseDouble(args[1]);
            double R = Double.parseDouble(args[2]);
            // e.g 2000 7 2.1 result 25.6232
            double n = 12 * Y;
            double r = R / (12 * 100);
            double payment = (P * r) / (1 - Math.pow((1 + r), -1 * n));

            System.out.println("Payment = " + payment);
        }
        catch (Exception e)
        {
            System.out.println("Error, please check arguments!");
        }
    }
}
