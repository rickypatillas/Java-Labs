package part_05;

public class ReviewForLoops {
    //write a traditional for loop 10 times - doing something slightly different each time


    public static void main(String[] args) {
        int i;
        int j;
        // 1
        for (i = 0; i < 15; i++) {
            System.out.print(i);
            System.out.println();
            for (j = 3; j > 2; j++) {
                System.out.print(j);
            }
        }
        System.out.println();

        //2
        for (i = 15; i > 0; i--) {
            System.out.println(i);
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        //3

        for (i = 0; i < 10; i++) {
            for (j = 10; j <= 10; j--) {
                if (j % 2 != 0) {
                    System.out.println(j); //not working.
                }
            }
        }

        //4
        for (i = 2; i < 20; i += 2) {
            System.out.println(i);
            if (i < 20) {
                if (i < 19 && i > 14) {
                    System.out.println(" Warm");
                } else if (i < 13 && i > 6) {
                    System.out.println(" Warmer");
                } else {
                    System.out.println("nuh man you're cold now");
                }
            }

        }
        System.out.println();

        //5
        for (i = 0; i <= 15; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " you're even");
            } else {
                System.out.println(i + " you're odd");
            }
        }
        System.out.println();

        //6
        for (i = 20; i > 0; i--) {
            System.out.print(i + " " + i);
        }
        System.out.println();

        System.out.println("********************");

        //7
        for (i = 0; i < 20; i++) {
            for (j = i; j < 20; j += i + 2) {
                System.out.println(j + "");
            }
        }

        //8
        for (i = 0; i < 10; i++) {
            for (j = 10; j > 0; j--) {
                if (j % 3 == 0) {
                    System.out.println(j);
                }
            }
        }

        for (i = 5; i < 100; i += 2) {
            if (i % 5 != 0) {
                System.out.println(i + " wowowowow");
            } else if (i % 2 == 0) {
                System.out.println(i + " jejejeje");

            }

        }
//        10
        double m;
        for (i = 0; i < 15; i++) {
            for (m = 2.3; m < 10.0; m++) {
                System.out.println((double) i);
            }
        }
    }

}
