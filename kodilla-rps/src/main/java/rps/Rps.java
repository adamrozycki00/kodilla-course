package rps;

import java.util.Scanner;

public class Rps {

    private String playerName;
    private int roundsToWin;
    private Scanner scanner = new Scanner(System.in);

    public void askForInitParams() {
        System.out.print("What's your name? ");
        playerName = getPlayerName(scanner.nextLine());

        System.out.print("What's the number of rounds? ");
        roundsToWin = getRoundsToWin(scanner.nextLine());

        System.out.printf("\n%s, you have to win %d rounds to win the game. Good luck!\n",
                playerName, roundsToWin);
        System.out.println("(press Enter)");
        scanner.nextLine();
    }

    public void showGameRules() {
        String gameRules = "Game rules:\n" +
                "\tpress '1' to choose rock\n" +
                "\tpress '2' to choose paper\n" +
                "\tpress '3' to choose scissors\n" +
                "\tpress 'x' to quit\n" +
                "\tpress 'n' to restart\n\n";
        System.out.println(gameRules);
    }

    private String getPlayerName(String input) {
        return input.length() > 0 ? input : "Player";
    }

    private int getRoundsToWin(String input) {
        int num;
        try {
            num = Integer.parseInt(input);
        } catch (Exception e) {
            num = 5;
        }
        return num;
    }

}
