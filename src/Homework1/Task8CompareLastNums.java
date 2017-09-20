package Homework1;

import java.util.Scanner;

public class Task8CompareLastNums {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Input two number within enter");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        boolean res = ((num1 % 10) == (num2 % 10));

        System.out.println("Is it true that last number of imputed numbers are the same? \n" + res);

    }
}
