package Model;
import java.util.*;

/**
 * This class represents the map of the game and stores MapBlocks.
 */
public class Map {


    private ArrayList<MapBlock> blocks;


    /**
     * Initialize an empty map.
     */
    public Map() {
        this.blocks = new ArrayList<MapBlock>(0);
    }

    /**
     * Initialize a map with n blocks
     * @param n the number of blocks
     */
    public Map(int n) {
        this.blocks = new ArrayList<MapBlock>(n);
        for(int i=0; i<n; i++){
            this.blocks.add(new MapBlock());
        }
    }

    /**
     * Fill the map with modifiers
     * @param modRatio % of the map to be filled with mods
     */
    public void PlaceRandomMods(int modRatio){
        for (MapBlock m : this.blocks){
            // TODO Change the random algorithm to something more accurate
            if(new Random().nextInt(100-modRatio)==0){
                int whichMod = new Random().nextInt(3);
                switch (whichMod){
                    case 0: m.AddElement(new Abyss()); break;
                    case 1: m.AddElement(new Glue()); break;
                    case 2: m.AddElement(new Oil()); break;
                }
            }
        }
    }

    /**
     * Ads an element to the map
     * @param i the index at where to place the element
     * @param e the element to place
     */
    public void AddElement (int i, BasicGameElement e){
        blocks.get(i).AddElement(e);
    }

    /**
     * Moves an element on the map, by a given offset
     * @param offset Number of blocks to shift right
     * @param e The element to move
     */
    public void MoveElement (int offset, BasicGameElement e){
        MapBlock mb = e.GetPosition();
        blocks.get(blocks.indexOf(mb) + offset).AddElement(e); // Add to new block
        mb.RemoveElement(e); // remove from old block
    }

    public void debugPrintMap(){
        for( MapBlock mb : blocks){
            System.out.print("[" + blocks.indexOf(mb) + "] -> ");
                for( BasicGameElement e : mb.GetElements()){
                    if(e instanceof Player) System.out.print("Player");
                    if(e instanceof Abyss) System.out.print("Abyss");
                    if(e instanceof Glue) System.out.print("Glue");
                    if(e instanceof Oil) System.out.print("Oil");
                }
            System.out.println();
        }
    }
}