package part_10;

public class ZincronadasContrl {
    public static void main(String[] args) {
        Zincronadas thread1 = new Zincronadas("Charizard");
        Zincronadas thread2 = new Zincronadas("Blastoisse");
        Zincronadas thread3 = new Zincronadas("Venaussur");




        try {
            thread1.thrd.join();
            thread2.thrd.join();
            thread3.thrd.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
