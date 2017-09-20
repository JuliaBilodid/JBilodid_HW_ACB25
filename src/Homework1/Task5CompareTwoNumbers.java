package Homework1;

import java.util.Scanner;

public class Task5CompareTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input two numbers with enter");
        double firstInputNumber = sc.nextDouble();
        double secondInputNumber = sc.nextDouble();

//коли порівнювати 2 відємних сисла, то результат не дає правильно (наприклад -30 і -15 , if видає, що -30 більше)
        if (firstInputNumber > secondInputNumber) {
            System.out.println("The difference between numbers is " + (firstInputNumber - secondInputNumber));
//виконувати додатванння в  System.out.println("The sum of two numbers is " + (firstInputNumber + secondInputNumber); як? не можна
        } else {
            //double sumofNumbers = firstInputNumber + secondInputNumber;
            System.out.println("The sum of two numbers is " + (firstInputNumber + secondInputNumber));
        }

    }
}
