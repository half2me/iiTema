package Model;

/**
 * This class represents the Abyss modifier.
 */
public class Abyss extends Modifier {


    /**
     * This is a constructor for the Abyss class.
     */
    public Abyss() {
    }

    /**
     * Specify which block to use
     * @param b the block to place the abyss on
     */
    public Abyss(MapBlock b){
        this.SetPosition(b);
    }


    /**
     * @param p
     * The method kills the Player.
     */
    public void Modify(Player p) {
        System.out.println("Abyss killed player");
        p.ModifySpeed(0);
        p.Destroy();
    }

}