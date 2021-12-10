////////////////////////////////////////////////////////////////////////////////////

// Garrett Wiese

// Doug Lundin

// CSC 160 Computer Science I

// September 12th, 2021

// Programming Exercise 2.1 (page 69)

////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class CtoF {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ///Asks the user for input in Celsius

        System.out.println("Enter any degree in Celsius");

        ///Stores the input from the user in a var called celsius

        double celsius = in.nextDouble();

        ///Does the formula for celsius to fahrenheit and stores it in a variable

        double conversion = (celsius * 9 / 5) + 32;

        ///Prints out the result of the program Celsius -> Fahrenheit

        System.out.println(celsius + " Celsius is " + conversion + " Fahrenheit");

        in.close();
    }
}
