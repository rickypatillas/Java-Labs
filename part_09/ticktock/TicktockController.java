package part_09.ticktock;

public class TicktockController {
    public static void main(String args[]) {
        TickTock tt = new TickTock();
        MyThread8 mt1 = new MyThread8("Tick", tt);
        MyThread8 mt2 = new MyThread8("Tock", tt);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch(InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("ALL DONE!");
    }

}

