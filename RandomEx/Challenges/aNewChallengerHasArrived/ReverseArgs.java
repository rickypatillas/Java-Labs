package RandomEx.Challenges.aNewChallengerHasArrived;

public class ReverseArgs {
    public static void main(String[] args) {

        for(int i = 0; i < args.length/2; i++){
            String temp;
            temp = args[args.length -1 -i];
            args[args.length-1-i] = args[i];
            args[i] = temp;
        }

        for(String x : args){
            System.out.println(x);
        }
    }
}
