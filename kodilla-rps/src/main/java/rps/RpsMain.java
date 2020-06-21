package rps;

import rps.game.RpsConfig;
import rps.game.RpsGame;

public class RpsMain {

    public static void main(String[] args) {
        RpsConfig config = new RpsConfig();
        config.askForInitParams();
        new RpsGame(config).run();
    }

}
