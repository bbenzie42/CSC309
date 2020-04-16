package srpfacadelab;

public class GameFacade
{
    private static IGameEngine game;
    private static RpgPlayer player1, player2;

    public static void setupGame()
    {
        game = new SimpleGameEngine();
        player1 = new RpgPlayer(game);
        player2 = new RpgPlayer(game);
        ((SimpleGameEngine) game).addPlayer(player1);
        ((SimpleGameEngine) game).addPlayer(player2);
        beginGame();
    }

    public static void beginGame()
    {
        //this is where code to begin the game would go
    }
}
