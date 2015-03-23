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
        System.out.println("<<create>> Map");
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
        System.out.println("<<create>> Map");
    }


    /**
     * Fill the map with modifiers
     * @param modRatio % of the map to be filled with mods
     */
    public void PlaceRandomMods(int modRatio){
        System.out.println("PlaceRandomMods method from Map class");
    }


    /**
     * Adds an element to the map
     * @param i the index at where to place the element
     * @param e the element to place
     */
    public void AddElement (int i, BasicGameElement e){
        System.out.println("AddElement method from Map class");
    }


    /**
     * Moves an element on the map by a given offset
     * @param offset Number of blocks to shift right
     * @param e The element to move
     */
    public void MoveElement (int offset, BasicGameElement e){
        System.out.println("MoveElement method from Map class");
    }


}