package rps;

import static rps.RpsTool.*;

public class RpsScore {

    private final RpsConfig rpsConfig;
    private int playerScore;
    private int machineScore;

    public RpsScore(RpsConfig rpsConfig) {
        this.rpsConfig = rpsConfig;
    }

    public void score(RpsTool player, RpsTool machine) {
        System.out.printf("%s: %s, Machine: %s\n", rpsConfig.getPlayerName(), player, machine);

        if (player == ROCK && machine == SCISSORS
                || player == SCISSORS && machine == PAPER
                || player == PAPER && machine == ROCK) {
            ++playerScore;
            System.out.printf("%s won!\n", rpsConfig.getPlayerName());
        }
        else {
            ++machineScore;
            System.out.println("Machine won...");
        }
    }

    public boolean maxScore() {
        return playerScore == rpsConfig.getMaxScore() || machineScore == rpsConfig.getMaxScore();
    }

    public void showScore() {
        System.out.printf("%20s vs. Machine\n", rpsConfig.getPlayerName());
        System.out.printf("%21d : %d\n", playerScore, machineScore);
    }

}
