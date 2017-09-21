package Homework1;

import java.util.Scanner;

public class W_Task5_1_Triangle90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input tree values - the lengths of triangle sides (within enter)");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > 0 && b > 0 && c > 0 && (a + b > c) && (a + c > b) && (b + c > a) &&
                ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (a * a + b * b == c * c))) {
            System.out.println("Congrat! The rectangular triangle can be build");

        } else {
            System.out.println("The rectangular triangle cant be build with this side's length");
        }
    }


}


