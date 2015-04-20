package Model;

/**
 * This is an abstract class for the Modifiers.
 */
public abstract class Modifier extends BasicGameElement {

    public Modifier() {
    }

    /**
     * @param p The Player to Modify
     */
    public abstract void Modify(Player p);

}