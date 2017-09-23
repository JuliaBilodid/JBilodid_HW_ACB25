package Week2;

import java.util.Scanner;

public class Task1Massive {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of your massive");
        int massiveLength = sc.nextInt();
        int[] massive = new int[massiveLength];

        int i = 0;
        while (i < massive.length) {
            int RandomValue = (int) (Math.random() * 10);
            massive[i] = RandomValue;
            i++;
        }

        for (int j = 0; j < massiveLength; j++) {
            System.out.print(massive[j] + " ");
        }

        int minValue = massive[0];
        int maxValue = massive[0];
        for (int k = 0; k < massiveLength; k++) {
            if (minValue > massive[k]) {

                minValue = massive[k];

            }
            if (maxValue < massive[k]) {

                maxValue = massive[k];

            }
        }
        System.out.println("\n MinValue " + minValue + "\n MaxValue " + maxValue);


        int indexmin = 0;
        int indexmax = 0;
        for (int l = 0; l < massiveLength; l++) {
            if (minValue == massive[l]) {

                indexmin = l;
            }
            if (maxValue == massive[l]) {

                indexmax = l;
            }
        }

        System.out.println("\n Index MinValue " + indexmin + "\n Index MaxValue " + indexmax);
    }
}