package Model;

/**
 * This class represents the Abyss modifier.
 */
public class Abyss extends Modifier {

    public Abyss() {
    }

    /**
     * @param p
     * The method kills the Player.
     */
    public void Modify(Player p) {
        p.ModifySpeed(0);
        p.Destroy();
    }

}