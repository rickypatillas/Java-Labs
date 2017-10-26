package part_10;

public class ConnectDots implements Runnable {

    Thread thrd;

    ConnectDots(String name){
        thrd = new Thread(this, name);
        thrd.start();
    }

    @Override
    public void run() {
     for(int i = 0; i <7; i++){
         Thread.currentThread().getName();
         try {
             Thread.sleep(400);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
         System.out.println(this.thrd.getName() + " " + i);

     }
    }
}
