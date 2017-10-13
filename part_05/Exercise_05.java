package part_05;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Write one class. This class must have two methods, a main() + a recursive method. The recursive method must take in
 * an integer as a parameter. The recursive method must then print out "Hello Recursion!" as many times as the "initial"
 * input parameter dictates. For instance if the int passed to the recursive method is 10. The recursive method must print
 * out "Hello Recursion!" 10 times.
 */
class Recursion {

    public static void main(String[] args) {
        Recursion ob = new Recursion();

        ob.recursiva(10);

    }

    public int recursiva(int i) {
        if (i == 1) {
            System.out.println("Hello Recursion!");
            return i;
        }

        System.out.println("Hello Recursion!" + " " + i);
        recursiva(i - 1);
    }

}