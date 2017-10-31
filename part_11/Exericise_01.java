package part_11;

/*
Let's say you have an integer array and a string array. Write a single method printArray that can print all
the elements of both arrays. The method should be able to accept both integer arrays or string arrays.

Complete the code so that it prints the following lines:

 1
 2
 3
 Hello
 World

*/

class Excercise_01{


    public  static <T> void  printArray(T[] papaya){

        for(T x : papaya){
            System.out.println(x);
        }

    }

    public static void main(String[] args) {

        Integer[] numArray = {1, 2, 3};
        String[] wordsArray = {"Hello", "World"};

        printArray(numArray);  //call method . arrayNames\
        printArray(wordsArray);
    }
}