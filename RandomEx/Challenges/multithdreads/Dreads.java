package RandomEx.Challenges.multithdreads;

public class Dreads implements Runnable {

    Thread thrd;

    Dreads(String name){
        thrd = new Thread(this, name);
        thrd.start();
        //this is how to make a thread
    }


    @Override
    public void run() {
        for(int i = 7; i > 0; i--){
            try {
                Thread.sleep(750);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(this.thrd.getName() + " does = " + i);
        }



    }
}
