package part_08;

public class Potatoe {
    public static void main(String[] args) {

        int[] hotPotato = new int[5];
        for (int i = 0; i < hotPotato.length; i++) {
            hotPotato[i] = i + 2;
        }

        try {
            System.out.println(hotPotato[6]);
        } catch (ArrayIndexOutOfBoundsException bear) {
            System.out.println("Exception caught" + bear.toString());
        }

        System.out.println(hotPotato[3]);

    }
}
