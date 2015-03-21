package Model;
import java.util.*;

/**
 * 
 */
public abstract class BasicGameElement {

    protected String type;
    private MapBlock position;

    /**
     * Call this method to destroy an object
     */
    public void Destroy() {
        this.GetPosition().RemoveElement(this);
    }

    /**
     * @return the MapBlock that the element is on
     */
    public MapBlock GetPosition() {
        return this.position;
    }

    /**
     * Sets the MapBlock that the element is on
     */
    public void SetPosition(MapBlock b) {
        this.position = b;
    }

    /**
     * @return type of GameElement
     */
    public String GetType() {
        return this.type;
    }

}