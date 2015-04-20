package Model;

/**
 * This class represents the Oil modifier.
 */
public class Oil extends Modifier {

    public Oil() {
    }

    /**
     * @param p
     * Locks the player's speed
     */
    public void Modify(Player p) {
        p.LockSpeed();
    }


}