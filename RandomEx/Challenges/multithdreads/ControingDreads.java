package RandomEx.Challenges.multithdreads;

public class ControingDreads {

    public static void main(String[] args) {
        Dreads dread1 = new Dreads("BobMarley");
        Dreads dread2 = new Dreads("ErikhaBadu");
        Dreads dread3 = new Dreads("WhoopiGoldberg");

        System.out.println("Who's got the coolest dreads?");

        try {
            dread1.thrd.join();
            dread2.thrd.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Cool dreads man");

        try {
            dread3.thrd.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("winner is...");

        //how do i make them print one after the other?
    }
}
