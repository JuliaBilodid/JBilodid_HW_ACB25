package Homework1;

import java.util.Scanner;

public class Task2Compare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input first number");
        int firstnumber = sc.nextInt();

        System.out.println("Input second number");
        int secondnumber = sc.nextInt();

        System.out.println("Input third number");
        int thirdnumber = sc.nextInt();

        if (firstnumber > secondnumber) {

            if (firstnumber > thirdnumber) {

                System.out.println("The biggest number is " + firstnumber);

                    if (secondnumber > thirdnumber) {

                    System.out.println("The smallest number is " + thirdnumber);

                    } else {

                        System.out.println("The smallest number is " + secondnumber);

                        }

            } else {

                    System.out.println("The biggest number is " + thirdnumber);
                    System.out.println("The smallest number is " + secondnumber);
                }

        } else {
                if (secondnumber > thirdnumber) {

                System.out.println("The biggest number is " + secondnumber);

                    if (firstnumber > thirdnumber) {

                    System.out.println("The smallest number is " + thirdnumber);

                     } else {

                        System.out.println("The smallest number is " + firstnumber);
                         }

                 } else {

                        System.out.println("The biggest number is " + thirdnumber);
                        System.out.println("The smallest number is " + firstnumber);
                    }

            }

    }

}
