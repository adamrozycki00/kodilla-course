package rps.game;

import rps.tools.RpsTool;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RpsGame {

    private final RpsConfig rpsConfig;
    private final Scanner scanner;
    private boolean end;

    public RpsGame(RpsConfig rpsConfig) {
        this.rpsConfig = rpsConfig;
        this.scanner = rpsConfig.getScanner();
    }

    public void run() {
        showGameRules();
        play();
    }

    private void play() {
        prepareToPlay();
        RpsScore rpsScore = new RpsScore(rpsConfig);
        rpsScore.showScore();
        List<RpsTool> tools = rpsConfig.getTools();
        Random rand = new Random();

        while (!end) {
            RpsTool playerChoice = getPlayerChoice(scanner.nextLine().toLowerCase());
            if (playerChoice == null)
                continue;
            RpsTool machineChoice = tools.get(rand.nextInt(tools.size()));
            rpsScore.score(playerChoice, machineChoice);
            rpsScore.showScore();
            if (rpsScore.maxScore())
                endGame();
        }
    }

    private RpsTool getPlayerChoice(String in) {
        switch (in) {
            case "1":
            case "2":
            case "3":
                return rpsConfig.getTools().get(Integer.parseInt(in) - 1);
            case "x":
                if (verifyQuit())
                    endGame();
                break;
            case "n":
                if (verifyRestart())
                    play();
                break;
        }
        return null;
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

    private void prepareToPlay() {
        System.out.println("***************** New game *****************");
        System.out.printf("%s, you have to win %d rounds to win the game. Good luck!\n",
                rpsConfig.getPlayerName(), rpsConfig.getMaxScore());
    }

    private boolean verifyQuit() {
        System.out.println("Are you sure you want to quit? (y/n)");
        return scanner.nextLine().toLowerCase().equals("y");
    }

    private boolean verifyRestart() {
        System.out.println("Are you sure you want to restart? (y/n)");
        return scanner.nextLine().toLowerCase().equals("y");
    }

    private void endGame() {
        end = true;
        System.out.println("**************** End of game ****************");
    }

}
