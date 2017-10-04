package part_01;

/**
 * Part 1 Exercise 6:
 *
 *      Write the necessary code to print out the result of the following:
 *
 *￼         1 + 3 + 5 + 7 + 9 + 11 + 13 + 15 + 17
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {
        // would work a lot better with a for loop
        int a, b, c, d, e, f, g, h, i;

        a = 1;
        b = 3;
        c = 5;
        d = 7;
        e = 9;
        f = 11;
        g = 13;
        h = 15;
        i = 17;

        int roca = (a + b + c + d + e + f + h + i + g);


        System.out.println("The result is " + roca);
    }
}
