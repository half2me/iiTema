import Model.Map;
import Model.Player;

import java.util.ArrayList;

/**
 * This class is responsible for the most important components of the game.
 */
public class Game {

    private Map map;
    private ArrayList<Player> players;
    private class Timer implements Runnable{
        @Override
        public void run() {
            while(true){
                tick();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {}
            }
        }
    }
    private Thread timer;

    /**
     * That is az empty constructor for the Game class.
     */
    public Game() {
        this.players = new ArrayList<Player>(1);
        this.timer = new Thread(new Timer());
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
        GenerateRandomMap();
        CreatePlayer("Beni");
        CreatePlayer("Madar");
        timer.start();
    }

    /**
     * This method is called when a game has finished.
     */
    public void Exit() {
        timer.stop();
    }

    /**
     * Move the game along by a cycle
     * Move the player by their speed etc.
     */
    public void tick()
    {
        for(Player p : players){
            for(int i=0; i < p.GetSpeed(); i++) {
                map.MoveElement(1, p); // We move the player one block at a time, so he steps on all blocks
                p.Step();
            }
        }
        this.map.debugPrintMap();
    }

    /**
     * @param args
     */
    public static void main(String[] args) {

    }


}