import java.util.Random;

/**
 * A test for our game
 */
public class Test {

    public static void main(String[] args) {
        // Init a new Game
        Game g = new Game();
        // Make a random map
        g.GenerateRandomMap();
        // Create two test players
        g.CreatePlayer("Beni", 'a', 'd', 'w', 'q', 'e');
        g.CreatePlayer("Madar", 'j', 'l', 'i', 'u', 'o');
        // Start the game
        g.NewGame();

        while(g.isRunning){
            // Randomly press input keys with ~15% chance of keypress / player
            int ran = new Random().nextInt(50);
            switch (ran){
                case 0: g.InputEvent('a'); break;
                case 1: g.InputEvent('d'); break;
                case 2: g.InputEvent('w'); break;
                case 3: g.InputEvent('q'); break;
                case 4: g.InputEvent('e'); break;

                case 5: g.InputEvent('j'); break;
                case 6: g.InputEvent('l'); break;
                case 7: g.InputEvent('i'); break;
                case 8: g.InputEvent('u'); break;
                case 9: g.InputEvent('o'); break;
            }
            // Manually cycle through ticks
            g.tick();
        }
    }
}