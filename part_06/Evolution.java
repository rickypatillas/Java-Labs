package part_06;

public class Evolution extends Pokemon {

    private String evolve;
    private int numEvolutions;

    public Evolution(String name, int number, String power, String type, int health, int strength,
                     String evolve, int numEvolutions) {
        super(name, number, power, type, health, strength);
        this.evolve = evolve;
        this.numEvolutions = numEvolutions;
    }

    public Evolution(String name, int number){
        super(name, number);
    }

    public Evolution(){
        super();
    }

    public boolean isPermanent(String evolve){
        if(evolve == "yes") {
            return true;

        }else {
            return false;
        }

    }
    public void description(){
        System.out.println(getName());
    }


    @Override
    public String toString() {
        return "Evolution{" +
                "evolve='" + evolve + '\'' +
                ", numEvolutions=" + numEvolutions +
                '}'+ super.toString();
    }

    public String getEvolve() {
        return evolve;
    }

    public void setEvolve(String evolve) {
        this.evolve = evolve;
    }

    public int getNumEvolitions() {
        return numEvolutions;
    }

    public void setNumEvolitions(int numEvolitions) {
        this.numEvolutions = numEvolitions;
    }

    void ditto(){
        System.out.println("ditto in Evolution");
    }
}
