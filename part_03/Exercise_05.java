package part_03;


import java.util.Scanner;

/**
 *
 */
public class Exercise_05 {

    public static void main(String[] strings) {

        // read an integer from the user >=1 and <= 999,999,999
        Scanner input = new Scanner(System.in);
        System.out.print("Enter: ");
        int yuka = input.nextInt();



        // use the && operator to see if the user's number is divisible by both 4 and 7
        if( yuka%4 == 0 && yuka%7 ==0) {
            System.out.println("your number is divisible by 4 and 7");
        }


        // use the ^ operator to see if the user's number is divisible for 4 or 7 exclusively
        if(yuka%4 == 0 ^ yuka%7 == 0) {
            if (yuka % 4 == 0) {
                System.out.println("divisible by 4 exclusively");
            }else
                System.out.println("divisble by 7 exclusively");
            }



        }


        // print out the results
    }

