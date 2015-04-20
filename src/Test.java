/**
 * A test for our game
 */
public class Test {

    public static void main(String[] args) {
        // Init a new Game
        Game g = new Game();
        g.GenerateRandomMap();
        g.CreatePlayer("Beni", 'a', 'd', 'w', 'q', 'e');
        g.CreatePlayer("Madar", 'j', 'l', 'i', 'u', 'o');
        g.NewGame();

        // We manually call ticks in this test
        while(g.isRunning){
            g.tick();
        }
    }
}