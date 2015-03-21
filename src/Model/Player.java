package Model;
import java.util.*;

/**
 * 
 */
public class Player extends BasicGameElement {

    /**
     * Init a player
     */
    public Player() {
        this.type = "Player";
        this.inAir = false;
        this.speed = 0;
        this.canPlaceMod = true;
        this.speedChangeable = true;
    }

    /**
     * Unique ID of the Player
     */
    protected int uID;

    /**
     * Name of the Player
     */
    protected String name;

    /**
     * 
     */
    protected boolean inAir;

    /**
     * 
     */
    protected int speed;

    /**
     * 
     */
    protected boolean canPlaceMod;

    /**
     * 
     */
    protected boolean speedChangeable;


    /**
     * Places a modifier under the player
     * @param m the modifier to place
     */
    public void PlaceMod(Modifier m) {
        if(this.canPlaceMod && this.inAir){
            this.GetPosition().AddElement(m);
        }
    }

    /**
     * @param bps
     */
    public void ModifySpeed(int bps) {
        // TODO implement here
    }

    /**
     * 
     */
    public void Jump() {
        // TODO implement here
    }

    /**
     * 
     */
    public void Step() {
        // TODO implement here
    }

    /**
     * 
     */
    public void LockSpeed() {
        this.speedChangeable = false;
    }

    /**
     * 
     */
    public void UnlockSpeed() {
        this.speedChangeable = true;
    }

}