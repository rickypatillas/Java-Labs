package RandomEx.CatchThrowEx;

public class CatchingBall {
    public static void main(String[] args) {
        try {
            weirdMethod();
        } catch (Exception e) {
            System.out.println(e.toString());
        }

         methodos();
        try {
            minishort();
        } catch (IndexOutOfBoundsException meme){
            System.out.println(meme.toString());
        }
    }


    public static void weirdMethod()throws Exception {
        int m = 7/0;
        System.out.println("this wont print, will it?" + m);
        throw new ArithmeticException();
    }

    public static void methodos(){
        System.out.println("this will print");
    }

    public static void minishort() throws IndexOutOfBoundsException {
        try {
            int[] coco = {1, 2, 3};
            System.out.println(coco[4]);
        } catch (IndexOutOfBoundsException momo) {
            System.out.println("no out of bounds");
            throw momo;
        }


    }
}
