import Model.Controller;
import Model.Map;
import Model.Player;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * This class is responsible for the most important components of the game.
 */
public class Game {

    private Map map;
    private ArrayList<Player> players;
    private ArrayList<Controller> controllers;
    private class Timer implements Runnable{
        @Override
        public void run() {
            while(true){
                tick();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {}
            }
        }
    }
    private Thread timer;
    private class InputWatcher implements Runnable{

        @Override
        public void run() {
            while(true){
                // Wait for keyboard event //
                char ch = 'b'; // <- Input from keyboard
                for(Controller c : controllers){
                    c.Action(ch);
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {}
            }
        }
    }
    private Thread inputWatcher = new Thread(new InputWatcher());


    /**
     * That is az empty constructor for the Game class.
     */
    public Game() {
        this.players = new ArrayList<Player>(1);
        this.timer = new Thread(new Timer());
        this.controllers = new ArrayList<Controller>(1);
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
    public void CreatePlayer(String name, char left, char right, char jump, char mod1, char mod2) {
        System.out.println("CreatePlayer method from Game class");
        Player p = new Player(name);
        Controller c = new Controller(p, left, right, jump, mod1, mod2);
        controllers.add(c);
        players.add(p);
        this.map.AddElement(0, p); // Add the player to the start line
    }

    /**
     * Users can start a new game calling this method.
     */
    public void NewGame() {
        System.out.println("NewGame method from Game class");
        GenerateRandomMap();
        CreatePlayer("Beni", 'a', 'd', 'w', 'q', 'e');
        CreatePlayer("Madar", 'j', 'l', 'i', 'u', 'o');
        //inputWatcher.start();  // <- uncomment when functional
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
        /* We check for any players that died, but are still in our list, and remove them */
        for(Iterator<Player> it = players.iterator(); it.hasNext();) {
            Player pl = it.next();
            if(pl.GetPosition() == null) {
                it.remove();
            }
        }

        if(players.isEmpty()) Exit(); // If there are no more players, its game over

        for(Player p : players) {
            for (int i = 0; i < p.GetSpeed(); i++) {
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