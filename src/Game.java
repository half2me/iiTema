import Model.Map;
import Model.Player;
import com.sun.tools.javac.jvm.Gen;

import java.util.ArrayList;

/**
 * This class is responsible for the most important components of the game.
 */
public class Game {

    private Map map;
    private ArrayList<Player> players;

    /**
     * That is a constructor for the Game class.
     */
    public Game() {
        this.players = new ArrayList<Player>(1);
    }


    /**
     *This method generates a Map which contains game elements randomly.
     */
    public void GenerateRandomMap() {
        System.out.println("GenerateRandomMap method from Game class");
    }


    /**
     * @param name
     * Use this if you want to create a new Player and this will place the Player to the start line.
     */
    public void CreatePlayer(String name) {
        System.out.println("CreatePlayer method from Game class");
    }


    /**
     * Users can start a new game calling this method.
     */
    public void NewGame() {
        System.out.println("NewGame method from Game class");
    }


    /**
     * This method is called when a game has finished.
     */
    public void Exit() {
        System.out.println("Exit method from Game class");
        // TODO implement here
    }


    /**
     * Move the game along by a cycle.
     * Move the player by their speed etc.
     */
    public void tick()
    {
	System.out.println("tick method from Game class");
    }


    /**
     * @param args
     */
    public static void main(String[] args) {
    }


}