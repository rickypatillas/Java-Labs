package part_10;
/*
Create an application that demonstrates the use of synchronized(), setPriority(), join(), getName() on
threads. A continous loop where you see the pro-cons of pokemon styles
 */

public class Zincronadas implements Runnable{
    Thread thrd;

    Zincronadas(String name){
        thrd = new Thread(this, name);
        thrd.start();
    }

    String c = "Charizard";
    String b = "Blastoisse";
    String v = "Venaussur";
    int a = 3;
    int r = 5;
    int x = 1;


    @Override
    public void run() {
        elemental();
    }


   synchronized public void elemental(){
        if(c != b ){
            System.out.println(a);
            return;

        }

    }

}

/*
TODO
similar to traffic light example on java_books-enums-TrafficLight
create and develop this concept once you have time and more knowledge.
*/



