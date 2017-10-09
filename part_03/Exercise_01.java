package part_03;

/**
  Write 3 classes. These classes can reside in the same file for ease and clarity.
  The first class (the controller) should have at least two methods, one of which being a main method.
  The main method needs to utilize constructors to create at least two separate objects. Each class must
  have at least 3 variables all 3 variables in each class must be used and set. Think about the Vehicle
  objects we have discussed in class. A vehicle has a make, model, MPG, 2/4 doors, color etc. Do not use a
  Vehicle object in this exercise :)

  Be creative. Have some fun. Using Java objects you can model just about anything you want. Cars, animals, poker games,
  sports teams, trees, beers, people and so on.

 **/
class BikeShop {
    public static void main(String[] args) {
        Motorcycle ryanBike = new Motorcycle(1250, "Chopper", "HarleyDavidson"); //string "" must always be on
        Motorcycle rickyBike = new Motorcycle(750, "Cafe Racer", "Honda");
        //create an object using motorcycle class because we are importing those variables

        Rider ryan = new Rider("Ryan", 35, 6.2); //object of the rider class
        Rider ricky = new Rider("Ricky", 27, 6.0); //assigning name to the rider

        Gear ryanGear = new Gear("full", "vest", "boots");
        Gear rickyGear = new Gear("open", "leather", "converse"); //object from the gear class

        ryan.setRiderBike(ryanBike); //where did the RiderBike come from?
        ryan.setRiderGear(ryanGear);
        ryanBike.increment(100);
        System.out.println(ryan.name + " has a " + ryanBike.brand + " and wears " + ryanGear.jacket + " "
                + ryanGear.boots);

        ricky.setRiderBike(rickyBike);
        ricky.setRiderGear(rickyGear);
        rickyBike.increment(250);



    }
}

class Motorcycle { //start with a class here plus the variables
    int cc; // instance variables of objects of class Motorcycle
    String type, brand;

    Motorcycle(int cc, String type, String brand) { //creation of the object
        this.cc = cc; // this.cc is so we can use just the name cc
        this.type = type;
        this.brand = brand;
    }

    public void increment(int ccChange) {
        this.cc += ccChange;
    } //WHOA WHAT IS THIS??

}
class Rider{

    String name;
    int age;
    double height;
    Gear riderGear; //this was added afterwards
    Motorcycle riderBike;

    Rider(String name, int age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void setRiderBike(Motorcycle bike) {
        this.riderBike = bike;
    } //what is this?

    public void setRiderGear(Gear gear) {
        this.riderGear = gear; //where does the "set" come from?
    }
}

class Gear{
        String helmet, jacket, boots;

        Gear(String helmet, String jacket, String boots) {
            this.helmet = helmet;
            this.jacket =  jacket;
            this.boots = boots;
        }

}