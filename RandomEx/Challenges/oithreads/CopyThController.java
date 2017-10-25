package RandomEx.Challenges.oithreads;

public class CopyThController {


    public static void main(String[] args) {
        String readFrom = "/home/ricardo/Desktop/DumbText";
        String writeTo = "/home/ricardo/Desktop/nomads";

        CopyThread file1 = new CopyThread("File1", readFrom, writeTo + "1.csv");
        CopyThread file2 = new CopyThread("File2", readFrom, writeTo + "2.csv");
        CopyThread file3 = new CopyThread("File3",readFrom, writeTo + "3.csv");
        CopyThread file4 = new CopyThread("File4",readFrom, writeTo + "4.csv");
        CopyThread file5 = new CopyThread("File5", readFrom, writeTo + "5.csv");



        try {
            file1.thrd.join();
            file2.thrd.join();
            file3.thrd.join();
            file4.thrd.join();
            file5.thrd.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
