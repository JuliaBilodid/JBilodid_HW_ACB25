package Homework1;

import java.util.Scanner;

public class Task1WorkTime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input current time");
        float time = sc.nextFloat();

        if (time >= 9 && time <= 18) {
            System.out.println("I'm at work");
        } else {
            System.out.println("I'm at home");
        }
    }
}
