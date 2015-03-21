package Model;
import java.util.*;

/**
 * The class can show us the properties of the Players.
 */
public class Player extends BasicGameElement {


    /**
     * Init a player.
     */
    public Player() {
        this.type = "Player";
        this.inAir = false;
        this.speed = 0;
        this.canPlaceMod = true;
        this.speedChangeable = true;
    }


    /**
     * Unique ID of the Player.
     */
    protected int uID;


    /**
     * Name of the Player.
     */
    protected String name;


    /**
     * This shows the Player is in the air or not.
     */
    protected boolean inAir;


    /**
     * Speed of the Player.
     */
    protected int speed;


    /**
     * This shows the Player can place modifiers or not.
     */
    protected boolean canPlaceMod;


    /**
     * This parameter shows us the Player can modify his/her speed or not.
     */
    protected boolean speedChangeable;


    /**
     * Places a modifier under the player.
     * @param m the modifier to place
     */
    public void PlaceMod(Modifier m) {
        System.out.println("PlaceMod method from Player class");
    //    if(this.canPlaceMod && this.inAir){
    //        this.GetPosition().AddElement(m);
        }
    }


    /**
     * @param bps
     * This can modify the speed of the Player.
     */
    public void ModifySpeed(int bps) {
        System.out.println("ModifySpeed method from Player class");
        // TODO implement here
    }


    /**
     * The Player can jump using this method.
     */
    public void Jump() {
        System.out.println("Jump method from Player class");
        // TODO implement here
    }


    /**
     * This realizes a step of the Player.
     */
    public void Step() {
        System.out.println("Step method from Player class");
        // TODO implement here
    }


    /**
     * Using this method the speed of the Player will be unchangeable.
     */
    public void LockSpeed() {
        System.out.println("LockSpeed method from Player class");
    //    this.speedChangeable = false;
    }


    /**
     * Using this method the speed of the Player will be changeable.
     */
    public void UnlockSpeed() {
        System.out.println("UnlockSpeed method from Player class");
        this.speedChangeable = true;
    }


}