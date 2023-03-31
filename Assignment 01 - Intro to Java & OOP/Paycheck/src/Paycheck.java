/*
Filename: SmallestInt.java
Author: Nathan L'Abbé
Date: 20th of March 2023
Purpose: Given the user's hourly rate of pay, and the number of hours worked. Display the Following
Display the user's gross pay, the withholding tax (10% of gross pay), and the net pay (gross pay - withholding).
 */
import java.util.Scanner;

public class Paycheck {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double grossPay, withholdingTax, netPay;
        double hourlyPay = 0;
        double hoursWorked = 0; /* Double so it can track partial hours. */

        
        if (args.length == 0)
        {
            System.out.print("Enter your Hourly Pay: ");
            hourlyPay = input.nextDouble();
            System.out.print("Enter the number of Hours worked: ");
            hoursWorked = input.nextDouble();
        }
        else if (args.length == 2) {
            hourlyPay = Double.parseDouble(args[0]);
            hoursWorked = Double.parseDouble(args[1]);
        }
        else {
            System.out.println("Proper Syntax for launching this program via command line arguments is Paycheck.java 'hourly pay here' 'total hours worked' ");

            /* Terminating the Program so the user can input the proper numbers into terminal */
            System.exit(20);
        }

        grossPay = hourlyPay * hoursWorked;
        withholdingTax = grossPay * 0.10; /* 0.10 = 10%   */
        netPay = grossPay - withholdingTax;

        System.out.println("\nPayment Information");
        System.out.println("Gross Pay: $" + String.format("%.2f", grossPay));
        System.out.println("Withholding Tax: $" + String.format("%.2f", withholdingTax));
        System.out.println("Net Pay: $" + String.format("%.2f", netPay));

    }
}
