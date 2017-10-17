package part_06;

public class Mega extends Evolution {
    public String mega;

    public Mega(String name, int number, String power, String type, int health, int strength,
                String evolve, int numEvolitions) {
        super(name, number, power, type, health, strength, evolve, numEvolitions);
    }

    public Mega(String name, int number){
        super(name, number);
    }

    public Mega(){

    }



    //
//    public Mega(String name, int number, String power, String type, int health, int strenght){
//        super(name, number, power, type, health, strenght);
//     } //porque no puedo???

    public boolean isMega(String mega){
        if(mega == "yes") {
            System.out.println("Mega-Mewtwo");
            return true ;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Mega{" +
                "mega='" + mega + '\'' +
                '}';
    }

    void ditto(){
        System.out.println("ditto in Mega");
    }
}
