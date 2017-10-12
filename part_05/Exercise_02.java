package part_05;

/**
 * Write two classes. In Class_01 (which contains the main()) create an instance of Class_02 and pass that instance
 * to a method_01 within Class_01. Within method_01 you ust manipulate several private instance variables within
 * Class_02. Then, from within method_01, pass the instance of Class_02 to a new method, method_02. Within method_02
 * modify the instance variables of Class_02 once again. Use System.out.println at various points to demonstrate the
 * flow of execution and the varying state of each private variable. You can name these classes whatever you want.
 */

class Kof_02 {
    public static void main(String[] args) {
        //name of fighters
        Kof_97 leona = new Kof_97();
        Kof_97 iori = new Kof_97();

        //stats of fighter no. 1
        System.out.print("Leona's stats are: ");

        leona.setKicking(9);
        leona.setPunching(3);
        leona.setType_of_power("Physical");

        System.out.println("kicking: " + leona.getKicking() + ", punching: " + leona.getPunching()
                + ", type of power: " + leona.getType_of_power() + ".");

        //stats of fighter no. 2
        System.out.println("Iori's stats are:");

        iori.setKicking(7);
        iori.setPunching(5);
        iori.setType_of_power("Meta-physical");

        System.out.println("kicking: " + iori.getKicking() + ", punching: " + iori.getPunching()
                + ", type of power: " + iori.getType_of_power() + ".");
    }

}


class Kof_97 {
    private int punching;
    private int kicking;
    private String type_of_power;

    public int getPunching() {
        return punching;
    }

    public void setPunching(int punching) {
        this.punching = punching;
    }

    public int getKicking() {
        return kicking;
    }

    public void setKicking(int kicking) {
        this.kicking = kicking;
    }

    public String getType_of_power() {
        return type_of_power;
    }

    public void setType_of_power(String type_of_power) {
        this.type_of_power = type_of_power;
    }
}