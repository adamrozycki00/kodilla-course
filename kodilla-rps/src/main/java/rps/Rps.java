package rps;

import java.util.Scanner;

public class Rps {

    private String playerName;
    private int maxScore;
    private final Scanner scanner;

    public Rps() {
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        askForInitParams();
        showGameRules();
        new RpsGame(this).play();
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getMaxScore() {
        return maxScore;
    }

    public Scanner getScanner() {
        return scanner;
    }

    private void askForInitParams() {
        System.out.print("What's your name? ");
        playerName = getPlayerName(scanner.nextLine());

        System.out.print("What's the number of rounds? ");
        maxScore = getRoundsToWin(scanner.nextLine());
    }

    private void showGameRules() {
        String gameRules = "\nGame rules:\n" +
                "\tpress '1' and Enter to choose ROCK\n" +
                "\tpress '2' and Enter to choose PAPER\n" +
                "\tpress '3' and Enter to choose SCISSORS\n" +
                "\tpress 'x' and Enter to quit\n" +
                "\tpress 'n' and Enter to restart\n";
        System.out.println(gameRules);
    }

    private String getPlayerName(String input) {
        int len = input.length();
        return len > 0 ?
                input.substring(0, Math.min(20, len)) : "Player";
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
