
package javaAssignment;

import java.util.Scanner;

public class Main {

    // Print numbers from 10 to 1
    public static void printNumbersDescending() {

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

    }

    //Even or Odd
    static void printEvenOrOdd() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) System.out.println(i + " Even!");
            else {
                System.out.println(i + " Odd!");
            }
        }
    }

    //Positive or Negative
    public static String checkNumberType(int number) {
        if (number < 0) {
            return "Negative";
        } else if (number > 0) {
            return "Positive";
        } else {
            return "Zero";
        }


    }

    //Sum
    public static int calculateSum(int number1, int number2){
        return number1 + number2;
    }



    // Main method: Program starts here
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("=========================");
            System.out.println("Number Analyzer Menu");
            System.out.println("=========================");
            System.out.println("1 - Numbers in Decsending order");
            System.out.println("2 - Even/Odd");
            System.out.println("3 - Check Number Type");
            System.out.println("4 - Calculate Sum");
            System.out.println("5 - Exit");
            System.out.println("=========================");

            System.out.print("Enter your choice: ");
            number = sc.nextInt();

            if (number == 1) {
                printNumbersDescending();

            } else if (number == 2) {
                printEvenOrOdd();

            } else if (number == 3) {
                System.out.print("Enter a number: ");
                int num = sc.nextInt();

                System.out.println(checkNumberType(number));

            } else if (number == 4) {
                System.out.print("Enter the first number: ");
                int number1 = sc.nextInt();

                System.out.print("Enter the second number: ");
                int number2 = sc.nextInt();

                System.out.println(calculateSum(number1, number2));

            } else if (number == 5) {
                System.out.println("Thank you for using Number Analyzer.");

            } else {
                System.out.println("Invalid Choice");
            }

        } while (number != 5);

        sc.close();

    }

}