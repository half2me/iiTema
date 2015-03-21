package Model;
import java.util.*;

/**
 * The class is an abstract class. This class represents the basic game elements which is needed for the playing.
 */
public abstract class BasicGameElement {


    protected String type;
    private MapBlock position;


    /**
     * Call this method to destroy an object.
     */
    public void Destroy() {
        System.out.println("Destroy method from BasicGameElement class");
    //    this.GetPosition().RemoveElement(this);
    }


    /**
     * @return the MapBlock that the element is on.
     * This method returns the MapBlock that the element is on.
     */
    public MapBlock GetPosition() {
        System.out.println("GetPosition method from BasicGameElement class");
        return this.position;
    }


    /**
     * Sets the MapBlock that the element is on.
     */
    public void SetPosition(MapBlock b) {
        System.out.println("SetPosition method from BasicGameElement class");
    //    this.position = b;
    }


    /**
     * @return type of GameElement.
     * This method returns the type of the game element.
     */
    public String GetType() {
        System.out.println("GetType method from BasicGameElement class");
        return this.type;
    }


}