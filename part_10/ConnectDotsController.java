package part_10;

public class ConnectDotsController {
    public static void main(String[] args) {

        ConnectDots thread1 = new ConnectDots("Player Green");
        ConnectDots thread2 = new ConnectDots("Player Red");
        ConnectDots thread3 = new ConnectDots("Player Yellow");
        ConnectDots thread4 = new ConnectDots("Player Blue");


        try {
            thread1.thrd.join();
            thread2.thrd.join();
            thread3.thrd.join();
            thread4.thrd.join();
        } catch (InterruptedException e) {
            System.out.println("There's an error with" + e.toString());
        }


        thread1.thrd.setPriority(5);
        thread2.thrd.setPriority(3);
        thread3.thrd.setPriority(10);
        thread4.thrd.setPriority(2);


    }
}
