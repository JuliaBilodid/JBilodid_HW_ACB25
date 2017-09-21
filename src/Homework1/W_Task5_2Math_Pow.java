package Homework1;

import java.util.Scanner;

public class W_Task5_2Math_Pow {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input tree numbers within enter");

        int[] mas = new int[3];
        //mas[0] = sc.nextInt();
        //mas[1] = sc.nextInt();
        //mas[2] = sc.nextInt();

        for (int i = 0; i < mas.length; i++) {

            mas[i] = sc.nextInt();
        }

        for (int i = 0; i < mas.length; i++) {

            if (mas[i] > 0) {
                System.out.println("Number " + mas[i] + " in the third degree equals " + Math.pow(mas[i], 3));

            } else {
                mas[i] = 0;
                System.out.println(mas[i]);

            }
        }


    }
}
