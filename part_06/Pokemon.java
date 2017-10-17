package part_06;

import org.omg.PortableServer.POA;

public class Pokemon {
    private String name;
    private int number;
    private String power;
    private String type;
    private int health;
    private int strength;

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", power='" + power + '\'' +
                ", type='" + type + '\'' +
                ", health=" + health +
                ", strength=" + strength +
                '}';
    }

    public Pokemon(String name, int number, String power, String type, int health, int strength) {
        this.name = name;
        this.number = number;
        this.power = power;
        this.type = type;
        this.health = health;
        this.strength = strength;
    }

    public Pokemon(String name, int number, String power, String type) {
        this.name = name;
        this.number = number;
        this.power = power;
        this.type = type;

    }

    public Pokemon(String name, String power, String type, int health, int strength) {
        this.name = name;
        this.power = power;
        this.type = type;
        this.health = health;
        this.strength = strength;
    }

    public Pokemon(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public Pokemon(){

    }
    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    void ditto(){
        System.out.println("ditto in Pokemon");
    }


}


//superclass = Pokemon
//variables: power, type, health, strenght


//subclass = Evolution
// String evolve
//no. evol stages
//method = permanent evolution?



//sub-subclass = mega
//method = permanent evolution?


//