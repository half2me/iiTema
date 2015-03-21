package Model;
import java.util.*;

/**
 * This class represents the map of the game, and stores MapBlocks
 */
public class Map {

    private ArrayList<MapBlock> blocks;

    /**
     * Initialize an empty map
     */
    public Map() {
        this.blocks = new ArrayList<MapBlock>(0);
    }

}