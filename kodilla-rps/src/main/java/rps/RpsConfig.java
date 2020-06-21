package rps;

import java.util.List;
import java.util.Scanner;

import static rps.RpsTool.*;

public class RpsConfig {

    private final List<RpsTool> tools;
    private final Scanner scanner;
    private String playerName;
    private int maxScore;

    public RpsConfig() {
        this.tools = List.of(ROCK, PAPER, SCISSORS);
        this.scanner = new Scanner(System.in);
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getMaxScore() {
        return maxScore;
    }

    public List<RpsTool> getTools() {
        return tools;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void askForInitParams() {
        System.out.print("What's your name? ");
        playerName = getPlayerName(scanner.nextLine());

        System.out.print("How many wins in the game? ");
        maxScore = getMaxScore(scanner.nextLine());
    }

    private String getPlayerName(String input) {
        int len = input.length();
        return len > 0 ?
                input.substring(0, Math.min(20, len)) : "Player";
    }

    private int getMaxScore(String input) {
        int num;
        try {
            num = Integer.parseInt(input);
        } catch (Exception e) {
            num = 5;
        }
        return num > 0 ? num : 5;
    }

}
