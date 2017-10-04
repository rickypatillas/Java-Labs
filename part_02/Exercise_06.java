package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 6:
 *
 *      Write a program called PrintNumberInWord which prints "ONE", "TWO",... ,
 *      "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively.
 *      Use a "switch-case" statement.
 *
 *
 */
public class Exercise_06 {

    public static void main(String[] args) {
        int num = 0;

         switch (num) {
             case 0:
                 System.out.println("ZERO");
                 break;
             case 1:
                 System.out.println("UNO");
                 break;
             case 2:
                 System.out.println("DOS");
                 break;
             case 3:
                 System.out.println("TRES");
                 break;
             case 4:
                 System.out.println("FOUR");
                 break;
             default:
                 System.out.println(num + " is whatevs");

         }


    }
}
