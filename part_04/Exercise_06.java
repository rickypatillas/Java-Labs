package part_04;

/**

 Implement, and populate a non-circular, consumptive queue (once a value has been retrieved
 it cannot be retrieved again) of integers 0 through 100. Then print out every other
 value in the queue.

 expected output: 0,2,4,6,8.....100

 */





class Queue {
    private int q[];               // this array holds the queue
    private int putloc, getloc;     // the put and get indices

    Queue(int size) {
        q = new int[size];         // allocate memory for queue
        putloc = getloc = 0;
    }


    public void put(int num) {
        if(putloc==q.length) {
            System.out.println(" -- Queue is full.");
            return;
        }

        q[putloc++] = num;
        return;
    }

    public int get() {
        if(getloc == putloc) {
            System.out.println(" -- Queue is empty.");
            return 0;
        }

        return q[getloc++];
    }
}

// Demonstrate the Queue class.
class QDemo {
    public static void main(String args[]) {

        Queue bigQ = new Queue(101); //bigQ size is 101 so it can contain 101 integers

        for(int i = 0; i < 101; i++) {
        if(i%2 == 0);
            System.out.println(bigQ.get()); //calling get method with bigQ object




        }
    }
}
