package part_09;

/* 8. 	Rewrite the program described in question 7 so that it uses
the character stream classes. This time, use the try-with-resources
statement to automatically close the file.
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class HyphensUpgrade {
    public static void main(String args[]) throws IOException
    {
        int i;

        String readFrom = "/home/ricardo/Desktop/DumbText";
        String writeTo = "/home/ricardo/Documents/dummyfile";
         //file to copy from and to.

        // Open and manage two files via the try statement.
        try (FileInputStream readin = new FileInputStream(readFrom);
             FileOutputStream writeout = new FileOutputStream(writeTo))
        {

            do {
                i = readin.read();
                System.out.println(i);
                if(i == ' ' ){
                    i = '-';
                }
                if(i != -1) writeout.write(i);
            } while(i != -1);


        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
