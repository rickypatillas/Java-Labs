package part_03;


/**

 Implement the following methods

 */

class Exercise_03 {


    public static void main(String[] strings) {


        // use a for loop to iterate 100 times {
        for (int i = 0; i < 100; i++) {
            int Random = (1) + (int) (Math.random() * (12 - 1 + 1));
            // Generate a random int between >= 1 and <= 12
//
            // call getMonthName(int month) and pass your random int
            String month = getMonthName(Random);
            // print the name of the month and the random int generated to the console
            System.out.println(month + " is the month and the random number is " + Random);
        }

    }
//
//    // Get the name for the month using the random int you generated

    public static String getMonthName(int month) {
            String mes = "";

        switch (month) {
            case 1:
                mes = "january";
                break;
            case 2:
                mes = "february";
                break;
            case 3:
                mes = "march";
                break;
            case 4:
                mes = "april";
                break;
            case 5:
                mes = "may";
                break;
            case 6:
                mes = "june";
                break;
            case 7:
                mes = "july";
                break;
            case 8:
                mes = "august";
                break;
            case 9:
                mes = "september";
                break;
            case 10:
                mes = "october";
                break;
            case 11:
                mes = "november";
                break;
            case 12:
                mes = "december";
                break;




        }

//
//         use a switch statement to determine the name of the month
//         for instance if the random int is 1 the name of month is January
//
         return mes;


//
    }
}


