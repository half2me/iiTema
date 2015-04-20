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
        this.speed = 2;
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
     * This parameter shows us if the Player can modify his/her speed or not.
     */
    private boolean speedChangeable;


    /**
     * Places a modifier under the player.
     * @param m the modifier to place
     */
    public void PlaceMod(Modifier m) {
        if(this.canPlaceMod && this.inAir){
            this.GetPosition().AddElement(m);
        }
    }


    /**
     * @param bps
     * This can modify the speed of the Player.
     */
    public void ModifySpeed(int bps) {
        this.speed = bps;
    }


    /**
     * @return the speed of the player
     */
    public int GetSpeed() {
        return this.speed;
    }


    /**
     * The Player can jump using this method.
     */
    public void Jump() {
        this.inAir = true;
    }


    /**
     * After a player's position has changed, this method should be called
     * This method is used to cycle through any modifiers which are under the player
     * and if needed execute their modifying function.
     */
    public void Step() {
        if(!inAir){
            for(BasicGameElement e : this.GetPosition().GetElements()){
                if(e instanceof Modifier){
                    ((Modifier) e).Modify(this);
                }
            }
        }
    }


    /**
     * Lock the Player's speed
     */
    public void LockSpeed() {
        this.speedChangeable = false;
    }


    /**
     * Make the speed changeable
     */
    public void UnlockSpeed() {
        this.speedChangeable = true;
    }


}