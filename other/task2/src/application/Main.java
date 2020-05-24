package application;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer number ");
        int number = parseInt(scanner.nextLine());
        if (number >= 0 & number <= 10) {
            System.out.println("It`s positive number less than or equal to 10");
        } else {
            System.out.println("It`s negative number or more than 10");
        }
    }
}
