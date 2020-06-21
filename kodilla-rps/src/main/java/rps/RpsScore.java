package rps;

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
            System.out.printf("%s won!\n", rpsConfig.getPlayerName());
            ++playerScore;
        } else if (result == 2) {
            ++machineScore;
            System.out.println("Machine won...");
        } else {
            System.out.println("Draw...");
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
