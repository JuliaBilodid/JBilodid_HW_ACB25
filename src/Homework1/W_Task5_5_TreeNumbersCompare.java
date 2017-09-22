package Homework1;

import com.sun.org.apache.xpath.internal.SourceTree;

public class W_Task5_5_TreeNumbersCompare {
    public static void main(String[] args) {

        int a = 5;
        int b = 7;
        int c = 5;

        if (a == b || a == c || b == c) {

            System.out.println("There is a pair of equal numbers");
        }

        if (a == b) {

            System.out.println("a=b");

        } else {
            if (a == c) {

                System.out.println("a=c");
            } else {

                if (b == c) {

                    System.out.println(b = c);
                }
            }
        }


    }
}
