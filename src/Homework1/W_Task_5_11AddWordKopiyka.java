package Homework1;

import java.util.Scanner;

public class W_Task_5_11AddWordKopiyka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введить к-сть");

        int coins = sc.nextInt();

        if (coins % 10 >= 5 && coins % 10 <= 9 || coins % 10 == 0) {

            System.out.println(coins + " копійок");

        } else {
            if(coins % 10 >= 2 && coins % 10 <= 4){

                System.out.println(coins + " копійки");
        }else {
                System.out.println(coins + " копійка");
            }
        }
    }
}
