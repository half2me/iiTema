package Model;

/**
 * The class represents a player
 */
public class Player extends BasicGameElement {


    /**
     * Init a player.
     * @param name name of the player
     */
    public Player(String name) {
        this.inAir = false;
        this.speed = 0;
        this.canPlaceMod = true;
        this.speedChangeable = true;
        this.name = name;
    }


    /**
     * Unique ID of the Player.
     */
    private int uID;


    /**
     * Name of the Player.
     */
    private String name;


    /**
     * This shows the Player is in the air or not.
     */
    private boolean inAir;


    /**
     * Speed of the Player.
     */
    private int speed;


    /**
     * This shows the Player can place modifiers or not.
     */
    private boolean canPlaceMod;


    /**
     * This parameter shows us the Player can modify his/her speed or not.
     */
    private boolean speedChangeable;


    /**
     * Places a modifier under the player.
     * @param m the modifier to place
     */
    public void PlaceMod(Modifier m) {
        System.out.println("PlaceMod method from Player class");
    }


    /**
     * @param bps
     * This can modify the speed of the Player.
     */
    public void ModifySpeed(int bps) {
        System.out.println("ModifySpeed method from Player class");
    }


    /**
     * @return the speed of the player
     */
    public int GetSpeed() {
        System.out.println("GetSpeed method from Player class");
        return null;
    }


    /**
     * The Player can jump using this method.
     */
    public void Jump() {
        System.out.println("Jump method from Player class");
    }


    /**
     * After a player's position has changed, this method should be called.
     * This method is used to cycle through any modifiers which are under the player
     * and if needed execute their modifying function.
     */
    public void Step() {
        System.out.println("Step method from Player class");
    }


    /**
     * Using this to lock the Player's speed
     */
    public void LockSpeed() {
        System.out.println("LockSpeed method from Player class");
    }


    /**
     * Using this method the speed of the Player will be changeable.
     */
    public void UnlockSpeed() {
        System.out.println("UnlockSpeed method from Player class");
    }


}