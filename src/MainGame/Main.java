package MainGame;

import Wiring.Init;

public class Main {

    public static void main(String[] args)
    {
        Main.Initialize();
    }

    private static void Initialize()
    {
        Init initialize = new Init();
        initialize.Initialize();

        Main game = new Main();
        game.Game();

    }
    private void Game()
    {
        System.out.println("Start Test");
    }


}
