package rps;

import static rps.RpsTool.*;

public class RpsScore {

    private Rps rps;
    private int playerScore;
    private int machineScore;

    public RpsScore(Rps rps) {
        this.rps = rps;
    }

    public void score(RpsTool player, RpsTool machine) {
        System.out.printf("%s: %s, Machine: %s\n", rps.getPlayerName(), player, machine);
        if (player == ROCK && machine == SCISSORS
                || player == SCISSORS && machine == PAPER
                || player == PAPER && machine == ROCK) {
            ++playerScore;
            System.out.printf("%s won!\n", rps.getPlayerName());
        }
        else {
            ++machineScore;
            System.out.println("Machine won...");
        }
    }

    public boolean maxScore() {
        return playerScore == rps.getMaxScore() || machineScore == rps.getMaxScore();
    }

    public void showScore() {
        System.out.printf("%20s vs. Machine\n", rps.getPlayerName());
        System.out.printf("%21d : %d\n", playerScore, machineScore);
    }

}
