package Week2;

import java.util.Scanner;

public class Task2FindMinElementMethod {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of your massive");
        int massiveLength = sc.nextInt();
        int[] mas2 = new int[massiveLength];

        int[] mas1 = createRanArr(massiveLength);

        printArr(mas1);
    }

    public static void printArr(int[] mas) {
        for (int j = 0; j < mas.length; j++) {
            System.out.print(mas[j] + ", ");
        }

    }


    public static int[] createRanArr(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        return arr;
    }
}

