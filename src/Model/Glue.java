package Model;

/**
 * This class represents the Glue modifier.
 */
public class Glue extends Modifier {


    /**
     * This is a constructor for the Glue class.
     */
    public Glue() {
    }


    /**
     * @param p
     * Slows the player to half-speed
     */
    public void Modify(Player p) {
        System.out.println("Modify method from Glue class");
        p.ModifySpeed(p.GetSpeed());
    }


}