import Model.Controller;
import Model.Map;
import Model.Player;
import Model.Robot;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * This class is responsible for the most important components of the game.
 */
public class Game {

    public boolean isRunning;
    private Map map;
    private ArrayList<Player> players;
    private ArrayList<Controller> controllers;
    private ArrayList<Robot> robots;

    /**
     * This class is responsible for periodically calling the tick method of the Game object
     */
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

    /**
     * This class is responsible for listening to keyboard input events, and forwarding them
     * to the controllers
     */
    private class InputWatcher implements Runnable{

        @Override
        public void run() {
            while(true){
                // Wait for keyboard event //
                char key = 'b'; // <- Input from keyboard
                InputEvent(key);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {}
            }
        }
    }
    private Thread inputWatcher = new Thread(new InputWatcher());

    public Game() {
        this.players = new ArrayList<Player>(1);
        this.timer = new Thread(new Timer());
        this.controllers = new ArrayList<Controller>(1);
        this.robots = new ArrayList<Robot>(0);
    }

    /**
     *This method generates a Map which contains game elements at random.
     */
    public void GenerateRandomMap() {
        map = new Map(100); // 100 blocks
        map.PlaceRandomMods(90);
    }


    /**
     * Creates a new Player
     * @param name Name of the player
     * @param left key# for left
     * @param right key# for right
     * @param jump key# for jump
     * @param mod1 key# for Glue
     * @param mod2 key# for Oil
     */
    public void CreatePlayer(String name, char left, char right, char jump, char mod1, char mod2) {
        Player p = new Player(name);
        Controller c = new Controller(p, left, right, jump, mod1, mod2);
        controllers.add(c);
        players.add(p);
        this.map.AddElement(0, p); // Add the player to the start line
    }

    /**
     * Add cleanup robots to the game
     * @param n number of robots to add
     */
    public void AddRobots(int n){
        for(int i = 0; i<n; i++){
            Robot r = new Robot(new Random().nextInt(2)+1);
            this.robots.add(r);
            this.map.AddElement(new Random().nextInt(100),r);
        }
    }

    /**
     * Users can start a new game calling this method.
     */
    public void NewGame() {
        //inputWatcher.start();  // <- uncomment when not in debug mode
        //timer.start(); // <- uncomment when not in debug mode
        isRunning = true;

    }

    /**
     * This method is called when a game has finished.
     */
    public void Exit() {
        //timer.stop(); // <- uncomment when not in debug mode
        isRunning = false;
    }

    /**
     * Move the game along by a cycle
     * Move the player by their speed etc.
     */
    public void tick()
    {
        if(!isRunning) return; // Don't do anything if the game isn't started yet
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
                // First, check if a player has reached the finish line
                if(map.isLast(p)) {
                    System.out.println(p.GetName() + " has won the game!!!");
                    Exit();
                }
                else{
                    map.MoveElement(1, p); // We move the player one block at a time, so he steps on all blocks
                    p.Step();
                }
            }
        }

        // Now lets move the clean-up robots
        for(Robot r : robots){
            for(int i=0; i < r.GetSpeed(); i++) {
                try{
                    if(r.GetSpeed()>0) map.MoveElement(1, r);
                    else map.MoveElement(-1, r);
                } catch (IndexOutOfBoundsException e){
                    r.Bounce();
                }
                r.Step();
            }
        }
        this.map.debugPrintMap();
    }

    /**
     * Use this method to input a keypress into the game
     * @param c key# of key pressed
     */
    public void InputEvent(char c){
        for(Controller con : controllers){
            con.Action(c);
        }
    }
}