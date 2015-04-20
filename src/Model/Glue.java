package Model;

/**
 * This class represents the Glue modifier.
 */
public class Glue extends Modifier {

    public Glue() {
    }

    /**
     * @param p the Player to interact with
     * Slows the player to half-speed
     */
    public void Modify(Player p) {
        if(p.GetSpeed()<2) return;
        p.ModifySpeed(p.GetSpeed()/2);
    }


}