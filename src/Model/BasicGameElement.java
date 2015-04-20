package Model;

/**
 * This class represents the basic game elements which are rendered when playing.
 */
public abstract class BasicGameElement {

    private MapBlock position;

    /**
     * Call this method to destroy an object.
     */
    public void Destroy() {
        this.position.RemoveElement(this);
        this.position = null;
    }


    /**
     * @return the MapBlock that the element is on.
     * This method returns the MapBlock that the element is on.
     */
    public MapBlock GetPosition() {
        return this.position;
    }


    /**
     * Sets the MapBlock that the element is on.
     */
    public void SetPosition(MapBlock b) {
        this.position = b;
    }

}