package rps.game;

import rps.tools.RpsTool;

import java.util.List;

public class RpsScore {

    private final RpsConfig rpsConfig;
    private int playerScore;
    private int machineScore;

    public RpsScore(RpsConfig rpsConfig) {
        this.rpsConfig = rpsConfig;
    }

    public void score(RpsTool playerChoice, RpsTool machineChoice) {
        System.out.printf("%s: %s, Machine: %s\n",
                rpsConfig.getPlayerName(), playerChoice, machineChoice);
        List<RpsTool> tools = rpsConfig.getTools();
        int result = (tools.indexOf(playerChoice) - tools.indexOf(machineChoice) + 3) % 3;
        if (result == 1) {
            ++playerScore;
            System.out.printf("%s won!\n", rpsConfig.getPlayerName());
        } else if (result == 2) {
            ++machineScore;
            System.out.println("Machine won...");
        } else {
            System.out.println("Draw...");
        }
    }

    public boolean maxScore() {
        int maxScore = rpsConfig.getMaxScore();
        return playerScore == maxScore || machineScore == maxScore;
    }

    public void showScore() {
        System.out.printf("%20s vs. Machine\n", rpsConfig.getPlayerName());
        System.out.printf("%21d : %d\n", playerScore, machineScore);
    }

}
