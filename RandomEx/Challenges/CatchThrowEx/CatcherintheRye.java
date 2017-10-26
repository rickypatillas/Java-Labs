package RandomEx.Challenges.CatchThrowEx;

public class CatcherintheRye {
    public static void main(String[] args) {
        try {
            messedupMethod();
        } catch (Exception e) {
            System.out.println("Error with ");
            System.out.println(e.toString());
        }

    }

    public static void messedupMethod() throws Exception {
        throw new Exception();
    }
}


