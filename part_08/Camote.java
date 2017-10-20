package part_08;

public class Camote {
    public static void main(String[] args) {


       Yam camotito = new Yam();



        try {
            camotito.elCarrito(5);
        } catch (Exception panda) {
            panda.printStackTrace();
        }
        System.out.println(camotito.chuchu);

    int[] chancla = new int[4];
    for(int i =0; i < 10; i++){
        chancla[i] = i+2;
    }
    try{
        System.out.println(chancla[2]); }
        catch (ArrayIndexOutOfBoundsException unicorn){
            System.out.println(unicorn);
        }

    }
}

/*Demonstrate throwing an exception. Create at least two classes. ClassA and ClassB. ClassA should have the main() method.
 The main() method needs to call a method in ClassB. This method in ClassB must generate and throw and exception back to
 ClassA. ClassA must either handle that exception or throw that exception back to the JVM.
 */

