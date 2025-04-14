package com.pluralsight;
import java.util.Scanner;
public class financialCalculators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please input your loan principal: ");
        float principal = input.nextFloat(); //P
        System.out.print("Please input your interest rate (in 0.00 format) : ");
        float rate = input.nextFloat(); //r
        System.out.print("Please input your loan length (in years): ");
        float length = input.nextFloat(); //y
        double month_num = 12 * length; //n
        float month_int = rate / 12;  //i
        double month_payment = principal * (month_int * Math.pow(1 + month_int, month_num)/ (Math.pow(1+ month_int, month_num) - 1));
        double total_int = (month_payment * month_num) - principal;

        System.out.println("Your monthly payment is: " + month_payment);
        System.out.println("Your total interest paid is: " + total_int);



        // hate it here new code calculator 2 start

        System.out.print("Please enter your deposit amount: ");
        float deposit = input.nextFloat();
        System.out.print("Please enter your interest rate(in decimal points): ");
        float i_rate = input.nextFloat();
        System.out.print("Please enter number of years: ");
        float years = input.nextFloat();
        float days = years * 365;
        double future_value =  (deposit * Math.pow(1 + (i_rate/365) , (days)));
        double tot_int = future_value - deposit;
        System.out.println("Your investments value in the future is: " + future_value);
        System.out.println("The total interest earned is: " + tot_int);

        //calc 3 time boiiiiiii why hardddd

        System.out.print("Enter your monthly payout: ");
        float payout = input.nextFloat();
        System.out.print("Enter your expected interest rate: ");
        float exp_rate = input.nextFloat();
        System.out.print("Enter Years to pay out annuity: ");
        float ypo = input.nextFloat();

        









    }
}
