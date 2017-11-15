package RandomEx.Challenges.aNewChallengerHasArrived;
/* - write this method "public int[] resverseArray(int[] t)" -
this method needs to reverse an array in place - you should only need to use one extra variable.
 */

public class Challenge_10_Nov_no1 {

    public static int[] reverseArray(int[] t){
        int temp; //create temporary variable that will hold value

        for(int i = 0; i < t.length/2; i++){
            //backup the original value at t[i]
            temp = t[i];
            //replace element at t[i] with element from backened of array
            t[i]= t[t.length-i-1];
            //replace the value from the back of the array with temp
            t[t.length-i-1] = temp;
        }
        return t;
    }


}
