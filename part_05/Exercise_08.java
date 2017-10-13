package part_05;

import sun.security.krb5.internal.crypto.Des;

/**
 * Write one class. This class must make use of an inner/nested class. Within the nested class, set the instance variables
 * of the outer class. Also, within the inner class, call at least two methods that have a return type of int. Add these
 * two ints together and set a final instance variable in the outer with this value.
 */
class Deserts {

    private int diabetes;
    private int sugarAmount;
    private double calories;
    private boolean lactose;


    public void accessInner(int d) {
        Helado vanilla = new Helado();
        vanilla.innerMethod(768);

        Helado choco = new Helado();
        choco.interiorMethod(475);

//        if(vanilla.interiorMethod() > 300){
//            System.out.println("your diabetes level is: " + diabetes);
//        } else {
//            System.out.println("you're good. Chow down");
//        }

        //i don't understand what I have access to and what I don't have access to.

    }

    public static void main(String[] args) {
        //how can i print out the values here since it does not give me access?
    }


    class Helado {


        public double innerMethod(int a) {

            return (sugarAmount + calories);
        }


        public double interiorMethod(int b) {
            return (sugarAmount + calories);
        }


    }

}

//
//        if(certainnumber < sugaramount)
//            dietFirendly
//diabetes
