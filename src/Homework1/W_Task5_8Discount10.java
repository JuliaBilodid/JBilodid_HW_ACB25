package Homework1;

import java.util.Scanner;

public class W_Task5_8Discount10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int purchaseSum = sc.nextInt();

        if (purchaseSum > 0 && purchaseSum >= 1000){

            System.out.println("You can have 10% discount, you'll have to pay " + purchaseSum*0.9);

        } else {

                if (purchaseSum > 0 && purchaseSum < 1000){

                System.out.println("Sorry, there is no discount for this sum");

                }else {

                    System.out.println("The input vale isnt correct");
            }
        }

    }
}
