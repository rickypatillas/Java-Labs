package part_05;

/**
 * Write two classes. Class_01 should have the main(). Class_02 should have various instance variables. At least one of
 * must be static. Within class_01 create at least 3 instances of class_02. Set the instance variables of class_02. Then,
 * just once, in one place, set the static instance variable in class_02. Afterwards, print out the value of each instance
 * variable and the static variable for each class.
 */
class Tacos {
    public static void main(String[] args) {

        Ingredients elFogon = new Ingredients("Pork", "Costilla");

        Ingredients donBuey = new Ingredients("Beef", "Pastor");

        Ingredients.setKg(1.5);

        elFogon.Precio(75.50);
        donBuey.Precio(72.75);

        System.out.println("The two best taco joints in Playa are " + elFogon.tacoStand() + " " +
                donBuey.tacoStand();





    }
}


class Ingredients {
    private String carne;
    private String type;
    private static double kg;
    private double price;


    public Ingredients(String carne, String type) {
        this.carne = carne;
        this.type = type;
    }

    public static double getKg() {
        return kg;
    }

    public static void setKg(double kg) {
        Ingredients.kg = kg;
    }

    public double Precio(double price){
        return price;
    }

    public void tacoStand(){
    }
}
