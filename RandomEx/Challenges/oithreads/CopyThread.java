package RandomEx.Challenges.oithreads;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyThread implements Runnable {

    Thread thrd;
    String readfrom;
    String writeTo;

    CopyThread(String name, String readfrom, String writeTo) {
        thrd = new Thread(this, name);
        thrd.start(); //creating my thread and starting it
        this.readfrom = readfrom;
        this.writeTo = writeTo;

    }


    @Override
    public void run() {

        try {
            copyFile();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

    public void copyFile() throws IOException {
        int i;
        try (FileInputStream fin = new FileInputStream(readfrom);
             FileOutputStream fout = new FileOutputStream(writeTo)) {
            do {
                i = fin.read();
                System.out.println(i);
                if (i != -1) fout.write(i);
            } while (i != -1);


        } catch (IOException lop) {
            System.out.println("I/O Error: " + lop);
        }


    }

}


