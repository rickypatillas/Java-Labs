package part_11.qqqqqq;

import java.util.ArrayList;

public class GenericQueue<T> {

    private ArrayList<T> genQueue; //underlying data structure for the Q
    private int putLocation, getLocation; //used to access specific elements
    private int size = 1000; //default size is 1000

    GenericQueue() {
        genQueue = new ArrayList<T>(); // create new arrayList
        putLocation = getLocation = 0; //set initial location values
    }

    GenericQueue(int size) {

        this.size = size; //set custom size for Q
        genQueue = new ArrayList<T>(); //create new ArrayList
        putLocation = getLocation = 0; //set initial location values
    }

    //create a get method
    public T get() throws QueueEmptyException {

        if (putLocation == getLocation) {
            System.out.println("Queue is Empty");
            throw new QueueEmptyException();
        }

        T retVal = genQueue.get(getLocation);
        getLocation++;
        return retVal;

        //this is also an equivalent to ^^^
        //return (genQueue.get(getLocation++));
    }


    //create a put method
    public void put(T obj) throws QueueFullException { //needs an object

        if (putLocation == size) {
            System.out.println("Queue is FULL");
            throw new QueueFullException();
        }
        genQueue.add(obj);
        putLocation++;
    }

    public boolean hasNext() {
        if (getLocation < putLocation) {
            return true;
        }
        return false;
    }

}
