package part_05;

/**
 * Demonstrate how variable-arity works, aka varargs. Create a method that uses "String ... varargs". Within the
 * varargs method, use StringBuilder to build a nicely formatted String/sentence using the varargs. Print this statement
 * to the console. Do this at least 3 times with different Strings/sentences.
 */
class Vergargs{

    public static void main(String[] args) {
        words("Ryan ", "puedes ", "decir ", "esto:");
        words("Tengo ", "un ", "piso ", "enladrillado");
        words("Quien ", "lo ", "desenladrillara?");
        words("El ", "que ", "lo ", "desenladrille,");
        words("Buen ", "desenladrillador ", "sera");

    }


    public static void  words(String ...v){
        StringBuilder estring = new StringBuilder();

        for(String x : v)
            estring.append(x);

        System.out.println(estring);
    }
}