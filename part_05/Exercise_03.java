package part_05;

/**
 * Write two classes. In Class_01 have a main method that creates on instance of Class_02. In Class_02, demonstrate
 * method overloading. You must overload a method a least 3 times. Each method should have a return type that is not
 * void. Within the main() (or a method of your choosing) in Class_01 call each overloaded method in Class_02.
 * Use System.out.println at various points to demonstrate the flow of execution. You can name these classes
 * whatever you want.
 */


class Diving {
    public static void main(String[] args) {
        Divers fernando = new Divers();

        fernando.Plata();
        System.out.println();

        fernando.Plata(1);
        System.out.println();

        fernando.Plata(49, 87);
        System.out.println();

        fernando.Plata(45.9, 78.43);
        System.out.println();

    }
}


class Divers {

    public void Plata() {
        System.out.println("Fernando Plata didn't compete");
    }


    public int Plata(int a) {
        a = 1;
        System.out.println("Fernando Platas got " + a + "st place.");
        return a * 2;
    }

    public double Plata(double a, double b) {
        System.out.println("Number of points obtained " + (a + b));
        return (a + b);
    }


    public int Plata(int a, int b) {
        System.out.println("Score was " + (b - a));
        return (b - a);
    }


}