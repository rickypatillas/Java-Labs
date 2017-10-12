package part_04;

class Stack {
        private char s[];               // this array holds the queue
        private int pointer;     // the put and get indices

        Stack(int size) {
            s = new char[size];         // allocate memory for queue
            pointer = 0;
        }

        // put a characer into the queue

        public void put(char ch) {
            if(pointer==s.length) {
                System.out.println(" -- Stack is full.");
                return;
            }

            s[pointer++] = ch; //pointer will increase
            //putloc++;
        }

        // get a character from the queue
        public char get() {
            if(pointer == 0) { //if pointer is at top, 0, then it's empty
                System.out.println(" -- Stack is empty.");
                return (char) 0; //q is empty, here's a blank character
            }

            return s[--pointer]; // you don't want to increase, you want to
            //return the pointer to the top, thus --pointer
        }
    }


    class StackDemo {
        public static void main(String[] args) {
            Stack newStack = new Stack(3);
            newStack.put('a');
            newStack.put('b');

            System.out.println(newStack.get());

        }



    }



























