package part_05;

/**
 * Write two classes. In Class_01 (which contains the main()) create an instance of Class_02 and pass that instance
 * to a method_01 within Class_01. Within method_01 you ust manipulate several private instance variables within
 * Class_02. Then, from within method_01, pass the instance of Class_02 to a new method, method_02. Within method_02
 * modify the instance variables of Class_02 once again. Use System.out.println at various points to demonstrate the
 * flow of execution and the varying state of each private variable. You can name these classes whatever you want.
 *
 */

class Kof_02{
    public static void main(String[] args) {
        Kof_02 lion = new Kof_02();
        Kof_97 ralph = new Kof_97();

        lion.updateKof97(ralph);

    }

    public void updateKof97(Kof_97 black){
        black.setKicking(85);
        updateKof97again(black);
    }

    public void updateKof97again(Kof_97 white){


    }
}


class Kof_97{
    private int punching;
    private int kicking;
    private int power;
    private String fire_type;

    public int upperImpact{

    }

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

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getFire_type() {
        return fire_type;
    }

    public void setFire_type(String fire_type) {
        this.fire_type = fire_type;
    }

    public int getUpperImpact() {
        return upperImpact;
    }

    public void setUpperImpact(int upperImpact) {
        this.upperImpact = upperImpact;
    }

    public


}