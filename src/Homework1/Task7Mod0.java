package Homework1;

import java.util.Scanner;
public class Task7Mod0 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input two number within enter");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        if (((num1 % num2) == 0) || ((num2 % num1) == 0)){
            if ((num1 % num2) == 0){

                int intpart = (int)(num1 / num2);

                System.out.println("The integer part of division num1 to num2 is " + intpart +
                                    "\n" + "The remainder part of division num1 to num2 is" + (num1 % num2));
            }
            else {
                    int rempart = (int)(num2 % num1);

                    System.out.println("The integer part of division num2 to num1 is " + (num2 / num1) +
                                       "\n" + "The remainder part of division num2 to num1 is " + rempart);

            }
        }


    }
}
