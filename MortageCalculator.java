//This program is a mortage calculator. It is for personal development.

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principle: ");
        int  principle = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float  annualInterestRate = scanner.nextFloat();

        System.out.print("Period(Years): ");
        int  period = scanner.nextInt();

        float monthlyRate = (annualInterestRate/100/12); // percentage of rate per year
        int numberPayment = period/12; //number of payments per month in a year
        double mortage = principle
                * (monthlyRate * Math.pow(1+monthlyRate, numberPayment))
                / Math.pow(1+monthlyRate, numberPayment) - 1;

        String mortageFormatted = NumberFormat.getCurrencyInstance().format(mortage);

        System.out.println("Mortage: " + mortageFormatted);

    }
}
