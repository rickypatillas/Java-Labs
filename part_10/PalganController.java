package part_10;

public class PalganController {
    public static void main(String[] args) {

        System.out.println("Starting thread 1");
        Palgan thread1 = new Palgan("Mori");
        thread1.start();

        System.out.println("Starting thread 2");
        Palgan thread2 = new Palgan("Nun");
        thread2.start();

    }
}
