package part_09;

/*
Demonstrate how to read file using BufferedInputStream - print each byte - be sure to close all connections

 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferInputStream {

    public static void main(String[] args) throws IOException {

        String unicorn;  // variable String for readLine


        try (BufferedReader a = new BufferedReader((new FileReader("/home/ricardo/Desktop/nomads/text_copy.txt")))) {
            while ((unicorn = a.readLine()) != null) {   //buffer has capacity for 3 fields. Buff, FileReader and txt
                //which is in bytes. Must put != null to verify it's not empty
                System.out.println(unicorn);
            }
        }
    }

}
