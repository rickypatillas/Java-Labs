package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 1:
 *      Celsius to Fahrenheit
 *
 *      Write the necessary code to read a degree in Celsius (as a double) from the console
 *      then convert it to fahrenheit and print it to the console.
 *
 *          F = 9 * (C / 5) + 32;
 *
 *      Output should read like - "27.4 degrees celsius = 81.32 degrees fahrenheit"
 */
public class Exercise_01 {

    public static void main(String[] args) throws java.io.IOException {
        // create scaner object
        Scanner input = new Scanner(System.in);

        //promts user
        System.out.print("Enter a degree in Celsius: ");

        //stores input in variable
        double degreeCelsius = input.nextDouble();

        System.out.println("Degree in Fahrenheit: " + (9*(degreeCelsius/5) +32));


        
    }
}
