package RandomEx.Reviews;

public class ReviewForEach {
    public static void main(String[] args) {


        int[] arrName = new int[5];
        arrName[0] = 1;
        arrName[1] = 2;
        arrName[2] = 3;
        arrName[3] = 4;
        arrName[4] = 5;


        for (int m : arrName) {
            System.out.println(m);
        }


        for (String s : args) {
            System.out.println(s);
        }

        System.out.println("....................................");

        double[] cArray = {5, 10.5, 15, 20};

        for (double m : cArray) {
            System.out.println(m);
        }
        System.out.println("..................................");


        String[] unicornio = {"Sally", "sells", "seashells", "by", "the", "seashore"};
        for (String horn : unicornio) {
            System.out.println(horn);
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>");

        for(int i= unicornio.length -1; i>= 0; i--){
            System.out.println(unicornio[i]);
        }

        System.out.println("......................");

        int[] cuzco = new int[10];
        for (int i = 0; i <= cuzco.length - 1; i++) {
            cuzco[i] = i*2;
            System.out.print(cuzco[i%2]);
            System.out.println("...");
            System.out.print(cuzco[i]);
        }
    }
}
