package rps;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static rps.RpsTool.*;

public class RpsGame {

    private Rps rps;
    private RpsScore rpsScore;
    private final List<RpsTool> tools;
    private RpsTool player = null;
    private RpsTool machine;
    private final Scanner scanner;
    private boolean end;

    public RpsGame(Rps rps) {
        this.rps = rps;
        this.tools = List.of(ROCK, PAPER, SCISSORS);
        rpsScore = new RpsScore(rps);
        scanner = rps.getScanner();
    }

    public void play() {
        prepareToPlay();
        Random random = new Random();
        while (!end) {
            String in = scanner.nextLine().toLowerCase();
            switch (in) {
                case "1":
                case "2":
                case "3":
                    player = tools.get(Integer.parseInt(in) - 1);
                    break;
                case "x":
                    if (verifyQuit())
                        end = true;
                    break;
                case "n":
                    if (verifyRestart())
                        play();
                    break;
                default:
                    continue;
            }
            machine = tools.get(random.nextInt(3));
            rpsScore.score(player, machine);
            rpsScore.showScore();
            if (rpsScore.maxScore())
                endGame();
        }
    }

    public Rps getRps() {
        return rps;
    }

    private boolean verifyQuit() {
        System.out.println("Are you sure you want to quit? (y/n)");
        return scanner.nextLine().toLowerCase().equals("y");
    }

    private boolean verifyRestart() {
        System.out.println("Are you sure you want to restart? (y/n)");
        return scanner.nextLine().toLowerCase().equals("y");
    }

    private void prepareToPlay() {
        System.out.println("New game!");
        System.out.printf("\n%s, you have to win %d rounds to win the game. Good luck!\n",
                rps.getPlayerName(), rps.getMaxScore());
        System.out.println("(press Enter)");
        scanner.nextLine();
    }

    private void endGame() {
        end = true;
        System.out.println("End of game");
    }

}
