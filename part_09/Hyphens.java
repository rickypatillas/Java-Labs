package part_09;

/*
-7. 	Write a program that copies a text file. In the process, have it convert all spaces into hyphens.
     Use the byte stream file classes. Use the traditional approach to closing a file by explicitly
     calling close( ).
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Hyphens {
    public static void main(String args[]) throws IOException
    {
        int i;
        String readFrom = "/home/ricardo/Desktop/DumbText";
        String writeTo = "/home/ricardo/Documents/dummyfile";
        FileInputStream comeIn = null;
        FileOutputStream getOut = null;



        // Copy a File.
        try {
            // Attempt to open the files.
            comeIn = new FileInputStream(readFrom);
            getOut = new FileOutputStream(writeTo);

            do {
                i = comeIn.read();
                if(i != -1) getOut.write(i);
                if(i == ' ' ){
                    i = '-';
                }
            } while(i != -1);


        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        } finally {
            try {
                if(comeIn != null) comeIn.close();
            } catch(IOException exc) {
                System.out.println("Error Closing Input File");
            }
            try {
                if(getOut != null) getOut.close();
            } catch(IOException exc) {
                System.out.println("Error Closing Output File");
            }
        }
    }


}
