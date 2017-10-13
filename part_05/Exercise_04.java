package part_05;

/**
 * Write two classes. Class_01 should have the main(). Class_02 must have 3 or more private variables. Class_02 must
 * also have at least 3 overloaded constructors. In Class_01.main() create several instances of Class_02 using each
 * overloaded constructor. Each constructor should do something slightly differently. Class_02 must have at least
 * two private instance variables. Using the various instances of Class_02 that you now have in Class_01, call a method
 * within each instance of Class_02 to modify Class_02's private instance variables.
 */
class Lfc {
    public static void main(String[] args) {
        Uniforms bestkit = new Uniforms(1976);
        Uniforms africanPlayer = new Uniforms(11, "Salah", 2017);
        Uniforms goat = new Uniforms(8, "Gerrard", 'g', 2005);
        Uniforms goat70 = new Uniforms(7, "Dalglish", 'm', 1977);

        System.out.println(goat.getName() + goat.getNumero() + goat.getYear() + goat.getSize() + " obtained ");
        System.out.println(goat.achievements(1, 0));
        System.out.println(goat70.getName() + " achieved ");
        System.out.println(goat70.achievements(4, 6));
        System.out.println("New generation: ");
        System.out.println(africanPlayer.getName() + " " + africanPlayer.getNumero());

    }
}


class Uniforms {
    private int numero;
    private String name;
    private char size;
    private int year;
    int champions_league;
    int domestic_league;
    String total;

    Uniforms(int year) {
        this.year = year;
    }

    Uniforms(int numero, String name, int year) {
        this.numero = numero;
        this.name = name;
    }

    Uniforms(int numero, String name, char size, int year) {
        this.numero = numero;
        this.name = name;
        this.size = size;
        this.year = year;
    }


    public int getNumero() {
        return numero;
    }

    public String getName() {
        return name;
    }

    public char getSize() {
        return size;
    }

    public int getYear() {
        return year;
    }

    public int achievements(int champions_league, int domestic_league) {
        return (champions_league + domestic_league); //how can i print them out without adding them?
    }
}
