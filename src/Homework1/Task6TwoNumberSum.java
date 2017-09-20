package Homework1;

import java.util.Scanner;

public class Task6TwoNumberSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input two numbers within enter");

        double FirstNumber = sc.nextDouble();
        double SeconfNumber = sc.nextDouble();

        if ((FirstNumber + SeconfNumber) > 11 && (FirstNumber + SeconfNumber) < 19) {
            System.out.println("The sum is " + (FirstNumber + SeconfNumber));
        }
    }

}