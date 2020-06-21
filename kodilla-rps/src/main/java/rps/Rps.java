package rps;

import java.util.Scanner;

public class Rps {

    private String playerName;
    private int roundsToWin;

    public void askForInitParams() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your name? ");
        playerName = getPlayerName(scanner.nextLine());

        System.out.print("What's the number of rounds to win? ");
        roundsToWin = getRoundsToWin(scanner.nextLine());

        System.out.printf("%s, you must win %d rounds to win the game. Good luck!", playerName, roundsToWin);
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
