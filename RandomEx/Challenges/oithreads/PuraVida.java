package RandomEx.Challenges.oithreads;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PuraVida implements Runnable {

    //implement variables
    String fileIn;
    String fileOut;

    //create your thread
    Thread thrd;

    PuraVida(String name){
        thrd = new Thread(this, name); //new thread
        thrd.start(); //start it too
    }


    @Override
    public void run() {

    }

//    public void copyVida() throws IOException {
//        int i;
//
//        try (FileInputStream fin = new FileInputStream(fileIn);
//             FileOutputStream fout = new FileOutputStream(fileOut)
//        {
//            do {
//                i = fin.read();
//                System.out.println(i);
//                if(i != -1) fout.write(i);
//            } while(i != -1);
//
//        } catch(IOException pip) {
//            System.out.println("I/O Error: " + pip);
//        }
//
//    }
}
