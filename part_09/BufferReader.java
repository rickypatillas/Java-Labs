package part_09;

/* Demonstrate how to read file using BufferedReader - demonstrate both the read() and readLine() methods()
be sure to close all connections
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {

    public static void main(String[] args) throws IOException {

        String unicorn;  //2 variables. String for readLine
        int dragon;      // and int for read -1

        try (BufferedReader a = new BufferedReader((new FileReader("/home/ricardo/Desktop/nomads/text_copy.txt")))) {
            while ((unicorn = a.readLine()) != null) {   //buffer has capacity for 3 fields. Buff, FileReader and txt
                //which is in bytes. Must put != null to verify it's not empty
                System.out.println(unicorn);
            }
        }

        try (BufferedReader a = new BufferedReader((new FileReader("/home/ricardo/Desktop/nomads/text_copy.txt")))) {
            while ((dragon = a.read()) != -1) { //use second int var dragon and only read, instead of readLine.
                // using -1 because int and because it signifies end of txt/error.
                System.out.println(dragon);
            }
        }
    }
}
