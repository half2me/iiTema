package Model;
import java.util.*;

/**
 * This is just one block of the map, it can contain Basic Game Elements
 */
public class MapBlock {

    private ArrayList<BasicGameElement> elements;

    /**
     * Initialize the object with an empty container
     */
    public MapBlock() {
        this.elements = new ArrayList<BasicGameElement>(0);
    }

    /**
     * @param e The element to add to the MapBlock
     */
    public void AddElement(BasicGameElement e) {
        this.elements.add(e);
        e.SetPosition(this);
    }

    /**
     * @param e The element to remove from the MapBlock
     */
    public void RemoveElement(BasicGameElement e) {
        this.elements.remove(e);
    }

    /**
     * @return all elements that are stored in the block
     */
    public ArrayList<BasicGameElement> GetElements() {
        return this.elements;
    }

}