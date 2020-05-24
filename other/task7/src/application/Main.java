package application;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer number ");
        int number = parseInt(scanner.nextLine());
        if ((number & 1) == 1) {
            System.out.println("It`s unpaired number");
        } else {
            System.out.println("It`s paired number");
        }
    }
}
