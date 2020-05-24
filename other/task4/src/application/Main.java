package application;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer number from 1 to 7 ");
        int number = parseInt(scanner.nextLine());
        switch (number) {
            case 1:
                System.out.print("It`s Monday");
                break;
            case 2:
                System.out.print("It`s Tuesday");
                break;
            case 3:
                System.out.println("It`s Wednesday");
                break;
            case 4:
                System.out.print("It`s Thursday");
                break;
            case 5:
                System.out.print("It`s Friday");
                break;
            case 6:
            case 7:
                System.out.print("It`s day of rest");
                break;
        }
    }
}
