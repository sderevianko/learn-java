package application;

import java.util.ArrayList;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
	    int number = (int) (random() * 10 + 1);
	    int factorial1 = 1;
        int factorial2 = 1;
        int factorial3 = 1;

	    for (int i = 1; i <= number; i++) {
            factorial1 = factorial1 * i;
        }
	    System.out.print("Factorial ");
        System.out.print(number);
        System.out.print(" = ");
        System.out.println(factorial1);

        int j = 1;
        while (j <= number) {
            factorial2 = factorial2 * j;
            j++;
        }
        System.out.print("Factorial ");
        System.out.print(number);
        System.out.print(" = ");
        System.out.println(factorial2);
        
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        for (int i = 1; i <= number; i++) {
            numberList.add(i-1, i);
        }

        for (Integer integer : numberList) {
            factorial3 = factorial3 * integer;
        }

        System.out.print("Factorial ");
        System.out.print(number);
        System.out.print(" = ");
        System.out.print(factorial3);
    }
}
