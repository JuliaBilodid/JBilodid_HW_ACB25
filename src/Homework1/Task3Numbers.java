package Homework1;

import java.util.Scanner;

public class Task3Numbers {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Input number");
        int inputNumber = sc.nextInt();
        int restofNumber = inputNumber % 7;
        //int result = inputNumber * 2;

// в умові if не можна писати формули? наприклда, заміть restofNumber = 0, написати ((inputNumber % 7) = 0)
        if ( restofNumber == 0){

            System.out.println(inputNumber + " * 2 = " + inputNumber * 2);

        }



    }

}
