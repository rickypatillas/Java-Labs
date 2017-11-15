package RandomEx.Challenges.aNewChallengerHasArrived;

/* - write this method "public void populateAndPrint2DArray()" - it should populate a 2D array in one nested loop -
 then in a second nested loop it should print out each number in the 2D array..
 */

public class Challenge_10_Nov_no2 {


    public static void main(String[] args) {

        populateAndPrint2DArray();
    }


    public static void populateAndPrint2DArray() {

        int[][] arrayName = new int[5][5];
        int count = 0;

        //for each index in the vertical array
        for (int i = 0; i < arrayName.length; i++) {
            //for each index in the horizontal array
            for (int m = 0; m < arrayName[i].length; m++) {
                //populate and increment count
                arrayName[i][m] = count++;
            }
        }

        //for each array "x" in arrayName(arrayName is 2D array)
        for (int[] x : arrayName) {
            //for each int "y in "x"
            for (int y : x) {
                //print t
                System.out.println(y);
            }
        }


    }
}
