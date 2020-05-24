package application;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer number from 1 to 7 ");
        int number = parseInt(scanner.nextLine());
        if (number == 1) {
            System.out.print("It`s Monday");
        } else {
            if (number == 2) {
                System.out.print("It`s Tuesday");
            } else {
                if (number == 3) {
                    System.out.print("It`s Wednesday");
                } else {
                    if (number == 4) {
                        System.out.print("It`s Thursday");
                    } else {
                        if (number == 5) {
                            System.out.print("It`s Friday");
                        } else {
                            System.out.print("It`s day of rest");
                            }
                        }
                    }
                }
            }
        }
    }
