package Model;

/**
 * This class represents the Abyss modifier.
 */
public class Abyss extends Modifier {

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
     * @param p the Player who will be killed by the Abyss.
     * The method kills the Player.
     */
    public void Modify(Player p) {
        System.out.println("Modify method from Modifier class");
        p.Destroy();
    }


}