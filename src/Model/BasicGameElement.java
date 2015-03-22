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
        System.out.println("Destroy method from BasicGameElement class");
    }


    /**
     * @return the MapBlock that the element is on.
     * This method returns the MapBlock that the element is on.
     */
    public MapBlock GetPosition() {
        System.out.println("GetPosition method from BasicGameElement class");
	return null;
    }


    /**
     * Sets the MapBlock that the element is on.
     */
    public void SetPosition(MapBlock b) {
        System.out.println("SetPosition method from BasicGameElement class");
    }


}