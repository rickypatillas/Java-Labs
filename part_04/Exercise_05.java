package part_04;

/**

 Here's an easy one for you.

 Create and populate an array with a length no less than 5. Use the enhanced for
 loop to iterate through the array and print out each value.

 */

class SelfEsteembooster {
    public static void main(String[] args) {


        int[] booster = {3, 8, 12, 43, 21, 98, 5, 9};

        for(int i = 0; i < booster.length; i++){
            System.out.println(" numbers are " + booster[i]);

        }

        for(int x : booster) {
            System.out.println("value of x is " + x);
        }




        //

    }
}
