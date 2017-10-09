package part_04;

/**
 * Use a for loop to count to 2017. While looping, populate an array with the
 * value of your iterator (ie, i). Once populated, print out the odd values
 * (ie, 2017, 2015, 2013) of the array in reverse order.
 */

class Lupin {

    public static void main(String[] args) {

        //create an array with length 1000
        int[] nameArr = new int[1000];
        // in one-for loop populated with only odd numbers
        for (int i = 0; i < nameArr.length; i++) {
            nameArr[i] = i;

            if (i % 2 != 0) {

                System.out.println(nameArr[i]);
            }
        }
//        //in another loop print out every 3rd value
        for(int i = 0; i < nameArr.length; i += 3){
            System.out.println(nameArr[i]);
        }


        int[] nums = new int[2017];

        for(int i = nums.length - 1; i >= 0; i--){
            nums[i]= i;
            if(i%2 != 0){
                System.out.println(nums[i]);
            }
        }
    }
}

