package Homework1;

import java.util.Scanner;

public class W_Task5_7Months {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the number of month");
        int monthNumber = sc.nextInt();

        if (monthNumber > 0 && monthNumber <= 12) {

            if ((monthNumber > 0 && monthNumber <= 2) || monthNumber == 12) {

                System.out.println("Its winter");

            } else {

                if (monthNumber >= 3 && monthNumber <= 5) {

                    System.out.println("Its spring");

                } else {

                    if (monthNumber >= 6 && monthNumber < 9) {

                        System.out.println("Its summer");

                    } else {

                        System.out.println("Its autumn");

                    }
                }

            }

        } else {
            System.out.println("There are only 12 months");

        }

    }
}
