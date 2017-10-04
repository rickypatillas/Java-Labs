package part_01;

/**
 * Part 1 Exercise 11:
 *      In the U.S., if there is:
 *          - One person who is born every 6 seconds
 *          - One person who dies every 12 seconds
 *          - One person who immigrates every 40 seconds
 *
 *      Write the necessary code to display the total population for the next 3 years (without a leap year)
 *
 *      Let's say the current population is 380,123,456.
 *
 */
public class Exercise_11 {

    public static void main(String[] strings) {
        int population = 380123456;
        //current year
        int year = 2017;

        //loop from current year for next 4
        for (int i = 2017; i <= 2020; i++) {
            //loop through every second of the year
            for (int s = 0; s <= 31536000; s++){
                //second divisible by 6 someone is born
                if (s%6 == 0) {
                    population++;
                }
                //someone immigrates every 40
                if (s % 40 == 0) {
                    population++;
                }
                }
            System.out.println("US population in " +i + "is " + population);
            }
        }
    }

