package application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print("Enter integer number ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
	    if (number % 2 !=0) {
            System.out.print("It`s unpaired number ");
	        System.out.println(number);
	    }
        if (number % 2 ==0) {
            System.out.print("It`s paired number");
        }
    }
}
