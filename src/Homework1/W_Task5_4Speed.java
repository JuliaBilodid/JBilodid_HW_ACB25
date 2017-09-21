package Homework1;

import java.util.Scanner;

public class W_Task5_4Speed {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the value of the speeds");
        double km_hour_speed1 = sc.nextInt();
        double m_sec_speed2 =  sc.nextInt();

        if(km_hour_speed1 * 1000 / 3600 > m_sec_speed2){

            System.out.println("The value of speed in km per hour is bigger");

        } else{
            System.out.println("The value of speed in m per sec is bigger or the same");
        }
    }
}
