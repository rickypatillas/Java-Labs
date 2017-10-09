package part_03;


import java.util.Scanner;

/**

 Code a "Rock Paper Scissors" Game

 */

public class Exercise_04 {

    public static void main(String[] strings) {


        // generate a random number >= 0 and <= 3
        int computerHand = (1) + (int) (Math.random() * (3 - 0));
        // use this as the computer's hand


        Scanner input = new Scanner(System.in);
        System.out.print("Enter 0 for scissor, 1 for rock, 2 for paper: ");
        int playerHand = input.nextInt();

        // call getHand(int hand) to determine the computers hand
        String playerStr = getHand(playerHand);

        // call getHand(int hand) to determine the players hand
        String computerStr = getHand(computerHand);

        // call determineWinner(int computerHand, int playerHand) to determine who one
        String winner = determineWinner(computerHand, playerHand);

        // print out a message to the console stating which hand the computer had, which hand
        // the play had and who won.
        System.out.println("you got " + playerStr + " and computer got " + computerStr +
            " and the winner is " + winner);
    }

    public static String getHand(int hand) { //where is this getting from?
        String handStr = "";  //the handStr is coming from where?
        // use a switch statement to determine each players hand
        // 0 = scissor, 1 = rock, 2 = paper
        switch(hand){
            case 0:
                handStr ="scissor";
                break;
            case 1:
                handStr = "rock";
                break;
            case 2:
                handStr = "paper";
                break;
        }

        return handStr;
    }

    public static String determineWinner(int computer, int player) {

        String status = "";

        switch (player) {
            // use conditional ("?") operator
            case 0:
                status = (computer != 1) ? "You won!" : "You lost :(";
                break;
            case 1:
                status = (computer != 2) ? "You won!" : "You lost :(";
                break;
            case 2:
                status = (computer != 0) ? "You won!" : "You lost :(";
                break;
            // implement the two remaining cases
        }

        return status;

    }
}