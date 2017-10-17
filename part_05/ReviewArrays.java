package part_05;

public class ReviewArrays {
    public static void main(String[] args) {
        int[] arnold = new int[5];

        for (int i = 0; i < arnold.length; i++) {
            arnold[i] = i * 3;
            if (i == 2) {
                System.out.println("not you football head");
            }
            System.out.println(arnold[i]);
        }

        System.out.println("*******************************");
        double[] phoebe = {3, 5.3, 77, 9.99, 11, 13};
        for (int m = 0; m < phoebe.length; m++) {
            System.out.println(phoebe[m]);
            if (phoebe[m] < 10) {
                System.out.println("Chik-chiki-chik-chiki-boom");
            } else if (phoebe[m] > 10) {
                System.out.println("They call me Cuban Pete");
            } else {
                System.out.println("You are not worthy of being Cuban Pete");
            }
        }
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        for(int n = phoebe.length-1; n >0; n--){
            System.out.println(phoebe[n]);
        }
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        for(int k = 0; k < phoebe.length; k++){
            System.out.println(phoebe[phoebe.length -1]-1);
        }

        System.out.println("$$$$$$$$for each $$$$$$$$$$$$$$$$$$");

        for(double pl : phoebe){
            System.out.println(pl);
        }


    }


}
