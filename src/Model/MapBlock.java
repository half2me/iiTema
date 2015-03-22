package Model;
import java.util.*;

/**
 * This is just one block of the map, it can contain Basic Game Elements.
 */
public class MapBlock {


    private ArrayList<BasicGameElement> elements;


    /**
     * Initialize the object with an empty container.
     */
    public MapBlock() {
        this.elements = new ArrayList<BasicGameElement>(0);
    }


    /**
     * @param e The element to add to the MapBlock.
     * This method adds an element to a MapBlock.
     */
    public void AddElement(BasicGameElement e) {
        System.out.println("AddElement method from MapBlock class");
        this.elements.add(e);
        e.SetPosition(this);
    }


    /**
     * @param e The element to remove from the MapBlock.
     * This method removes an element from the MapBlock.
     */
    public void RemoveElement(BasicGameElement e) {
        System.out.println("RemoveElement method from MapBlock class");
        this.elements.remove(e);
    }


    /**
     * @return all elements that are stored in the block
     * This method can return with an ArrayList which stores basic game elements.
     */
    public ArrayList<BasicGameElement> GetElements() {
        //System.out.println("GetElements method from MapBlock class");
        return this.elements;
    }

}