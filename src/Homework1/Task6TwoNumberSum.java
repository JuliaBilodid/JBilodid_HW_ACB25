package Homework1;

import java.util.Scanner;

public class Task6TwoNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input two numbers");
        int FirstNumber = sc.nextInt();
        int SeconfNumber = sc.nextInt();
        if ((FirstNumber+SeconfNumber) > 11 && (FirstNumber+SeconfNumber) < 19){
            System.out.println("The sum is ");
        } // як робити додавання в System.out.println(
    }
}
