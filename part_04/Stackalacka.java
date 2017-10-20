package part_04;

import part_08.StackEmptyException;
import part_08.StackFullException;

class Stack {
    private char s[];               // this array holds the queue
    private int pointer;     // the put and get indices

    Stack(int size) {
        s = new char[size];         // allocate memory for queue
        pointer = 0;
    }

    // put a characer into the queue

    public void put(char ch) throws StackFullException {
        if (pointer == s.length) {
            throw new StackFullException();
        }
        s[pointer++] = ch; //pointer will increase
        //putloc++;
    }

    // get a character from the queue
    public char get() throws StackEmptyException {
        if (pointer == 0) { //if pointer is at top, 0, then it's empty
            throw new StackEmptyException(); //q is empty, here's a blank character
        }

        return s[--pointer]; // you don't want to increase, you want to
        //return the pointer to the top, thus --pointer
    }
}


class StackDemo {
    public static void main(String[] args) {
        Stack newStack = new Stack(1);
        try {
            newStack.put('a');
        } catch (StackFullException panda) {
            System.out.println(panda.toString());
        }
        try {
            newStack.put('b');
        } catch (StackFullException bear) {
            System.out.println(bear.toString());
        }

        try {
            System.out.println(newStack.get());
        } catch (StackEmptyException panda) {
            System.out.println(panda.toString());

        }

    }


}



























