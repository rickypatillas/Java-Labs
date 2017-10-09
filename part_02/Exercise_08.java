package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 8:
 *
 *      Receive a number between 0 and 1,000,000,000 from the user.
 *      Use while loop to find the number - when the number is found
 *      exit the loop and print the number to the console.
 *
 */
public class Exercise_08 {
    public static void main(String[] args) {

        int x = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");

        int numero = input.nextInt();


        if (numero >= 0 && numero <= 10) {

            System.out.println("Valid number");


            while (x != numero) {
                System.out.println("your number is " + numero);
                x ++;
            }

            }else
            System.out.println("My guess is " + x + " matches your number " + numero);




//        for(int i = 1; i<10; i++) {
//            System.out.print(i + " ");
//
//            if ( (i%2) == 0)
//                continue;
//            System.out.println();
        }
    }


