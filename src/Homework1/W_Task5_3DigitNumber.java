package Homework1;

import java.util.Scanner;

public class W_Task5_3DigitNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input three digit number");
        String num = sc.next();
        char[] mas = num.toCharArray();
        if (mas[0] == mas[1] && mas[0] == mas[2]) {
            System.out.println("All digit in number are equal");
        } else {
            if (mas[0] == mas[1] || mas[0] == mas[2] || mas[1] == mas[2]) {
                System.out.println("Two digits in this number are equal");
            } else {
                System.out.println("All digits in this number are different");
            }
        }

    }
}
