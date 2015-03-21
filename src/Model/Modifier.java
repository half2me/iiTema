package Model;
import java.util.*;

/**
 * 
 */
public abstract class Modifier extends BasicGameElement {

    /**
     * 
     */
    public Modifier() {
        this.type = "Modifier";
    }

    /**
     * @param p The Player to Modify
     */
    public abstract void Modify(Player p);

}