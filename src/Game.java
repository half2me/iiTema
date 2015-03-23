import Model.Map;
import Model.Player;

import java.util.ArrayList;

/**
 * This class is responsible for the most important components of the game.
 */
public class Game {

    private Map map;
    private ArrayList<Player> players;

    /**
     * That is az empty constructor for the Game class.
     */
    public Game() {
        this.players = new ArrayList<Player>(1);
    }


    /**
     *This method generates a Map which contains game elements randomly.
     */
    public void GenerateRandomMap() {
        System.out.println("GenerateRandomMap method from Game class");
        map = new Map(100); // 100 blocks
        map.PlaceRandomMods(90);
    }


    /**
     * @param name
     * Use this if you want to create a new Player.
     */
    public void CreatePlayer(String name) {
        System.out.println("CreatePlayer method from Game class");
        Player p = new Player(name);
        players.add(p);
        this.map.AddElement(0, p); // Add the player to the start line
    }

    /**
     * Users can start a new game calling this method.
     */
    public void NewGame() {
        System.out.println("NewGame method from Game class");
        // TODO implement here
        GenerateRandomMap();
        CreatePlayer("TestPlayer");
        this.map.debugPrintMap();
    }

    /**
     * This method is called when a game has finished.
     */
    public void Exit() {
        System.out.println("Exit method from Game class");
        // TODO implement here
    }

    /**
     * Move the game along by a cycle
     * Move the player by their speed etc.
     */
    public void tick()
    {
        for(Player p : players){
            map.MoveElement(p.GetSpeed(), p);
            p.Step();
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {

    }


}