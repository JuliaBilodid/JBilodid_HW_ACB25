package Homework1;

import java.util.Scanner;

public class Task4DoubleNmber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number with floating dot");
        double inputNumber = sc.nextDouble();
        if (inputNumber > 0 && inputNumber < 1) {
            System.out.println("The input number lies between 0 and 1");
        } else {
            System.out.println("The input number is bigger than 1 smaller than 0 or equals 1 or 0");
        }
    }
}
