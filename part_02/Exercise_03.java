package part_02;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Part 2 Exercise 3:
 *
 *      Read in a number in feet from the console
 *      and print out the corresponding length in meters
 *
 *      1 foot = .305 meter.
 */

public class Exercise_03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter lenght: ");

        double feet = input.nextDouble();

        double meters = feet*.305;

        System.out.println("That is " + meters + " in meters");



    }
}
