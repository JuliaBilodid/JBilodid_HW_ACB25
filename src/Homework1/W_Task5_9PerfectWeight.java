package Homework1;

import java.util.Scanner;

public class W_Task5_9PerfectWeight {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, input your height");
        int height = sc.nextInt();
        System.out.println("Please, input your weight");
        int weight = sc.nextInt();

        if (height > 100 && height <= 165) {

            System.out.println("Your perfect weight is " + (height - 100));

            if (weight < (height - 100)) {

                System.out.println("You should eat more");

            } else {

                if ((height - 100 != weight)) {

                    System.out.println("It would be good to you to balance your diet");

                }
            }


        } else {

            if (height > 165 && height <= 175) {

                System.out.println("Your perfect weight is " + (height - 105));

                if (weight < (height - 105)) {

                    System.out.println("You should eat more");
                } else {

                    if ((height - 105 != weight)) {

                        System.out.println("It would be good to you to balance your diet");

                    }
                }
            } else {

                if (height > 175) {

                    System.out.println("Your perfect weight is " + (height - 110));

                    if (weight < (height - 110)) {

                        System.out.println("You should eat more");

                    } else {

                        if ((height - 110 != weight)) {

                            System.out.println("It would be good to you to balance your diet");
                        }
                    }
                } else {

                    System.out.println("We cant count your perfect weight");

                }

            }

        }

    }
}
