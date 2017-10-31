package part_11;

/**
 * Write a generic method to exchange the positions of two different elements in an
 * array.
 */


public class Exercise_02 {

    public static <T> void exchangeArray(T[] megaArray, int position1, int position2) {

        T temp = megaArray[position1];
        megaArray[position1] = megaArray[position2];
        megaArray[position2] = temp;
    }

    public static void main(String[] args) {

        Integer[] anotherArray = {0, 1, 2, 3, 4, 5};

        exchangeArray(anotherArray, 2, 1);

        for (Integer x : anotherArray) {
            System.out.println(x);
        }

    }
}
