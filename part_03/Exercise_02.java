package part_03;

/**

 Write a class that has at least 3 methods, one of which being a main() method.
 The two other methods need to use the "return" keyword.
 Use the values returned from these two methods to accomplish a task.

 */

class Guns {

    int rounds;
    double caliber;
    String name;

    Guns(String name, int rounds, double caliber) { //the creation of my constructor
        this.rounds = rounds;
        this.name = name;
        this.caliber = caliber;
        }

    public void bang () {
        System.out.println("Phew-Phew");
        rounds--;
        }

    public int getRounds() {
        return rounds;
        } //this method returns a variable: rounds

    public  double getCaliber() {
        return caliber;
        } //this method will return a double value of caliber

    public static void main(String[] args) {
        Guns revolver = new Guns("revolver", 6, .55); //the creations of my objects
        Guns rifle = new Guns("rifle", 12, .350);

        double revolverCal = revolver.getCaliber();
        System.out.println("Your weapon type is " + revolver.name + " with a caliber " + "of "
            + revolver.getCaliber());
        System.out.println("You have a total of " + revolver.getRounds() + " rounds available");

        while (revolver.getRounds() > 0) {
            revolver.bang();
        }

        System.out.println("all outta bullets!");
        System.out.println();

        double rifleCal = rifle.getCaliber();
        System.out.println("Your weapon type is " + rifle.name + " with a caliber " +
            "of " + rifle.getCaliber());
        System.out.println("You have a total of " + rifle.getRounds() + "rounds available");

        while (rifle.getRounds()>0) {
            rifle.bang();
        }

        System.out.println("All outta bullets too!");




    }
}