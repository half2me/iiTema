package Model;

/**
 * This is an abstract class for the Modifiers.
 */
public abstract class Modifier extends BasicGameElement {


    /**
     * This is a constructor for the Modifier class.
     */
    public Modifier() {
    }


    /**
     * @param p The Player to Modify
     */
    public abstract void Modify(Player p);


}