package part_11.qqqqqq;

public class QueueFullException extends Exception {
    int size;
    char value;

    public QueueFullException(int size, char value){
        this.size = size;
        this.value = value;
    }

    public QueueFullException(){
    }

    @Override
    public String toString() {
        return " Queue is full- It has a max capacity of " + size + " elements - Your value of "
                + value + " was not stored";
    }
}
