package application;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first real number ");
        double number1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter second real number ");
        double number2 = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter third real number ");
        double number3 = Double.parseDouble(scanner.nextLine());
        double average = (number1 + number2 + number3) / 3;
        System.out.print("Average of three number = ");
        System.out.print(average);
    }
}
