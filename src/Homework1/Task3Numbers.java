package Homework1;

import java.util.Scanner;

public class Task3Numbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input number");
        int inputNumber = sc.nextInt();

        if ((inputNumber % 7) == 0) {

            System.out.println(inputNumber + " * 2 = " + (inputNumber * 2));

        }
    }
}
