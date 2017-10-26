package part_10;



public class Palgan extends Thread {

    String irum;

    public Palgan(String irum){
        this.irum = irum;

    }

    public void run(){
        Thread.currentThread().setName(this.irum);
        for(int i = 0; i < 15; i++){
            System.out.println("number is: " + i + "-" +
                    Thread.currentThread().getName());
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                System.out.println("Error is " + e.toString());
            }
        }
    }

}
