package Homework1;

import java.util.Scanner;

public class W_Task5_10PhoneTalking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What is the day of the week today?");
        String dayOfWeek = sc.next();
        System.out.println("How long would you like to talk (from 1 to 7 minutes)?");
        double timeOfTalk = sc.nextInt();
        double pricePerMinute = 50;

        //if (dayOfWeek == "Saturday" || dayOfWeek == "saturday" || dayOfWeek == "Sunday"|| dayOfWeek == "sunday") {
        if (dayOfWeek.equals("Saturday") == true ||
                dayOfWeek.equals("saturday") == true ||
                dayOfWeek.equals("Sunday") == true ||
                dayOfWeek.equals("sunday") == true) {

            System.out.println("The price for your talk will be " + (timeOfTalk * pricePerMinute * 0.8));

        } else {

            System.out.println("The price for your talk will be " + (timeOfTalk * pricePerMinute));
            System.out.println(dayOfWeek);

        }

    }

}

