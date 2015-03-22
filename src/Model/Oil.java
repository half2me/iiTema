package Model;
import java.util.*;

/**
 * This class represents the Oil modifier.
 */
public class Oil extends Modifier {


    /**
     * This is a constructor for the Oil class.
     */
    public Oil() {
    }


    /**
     * @param p
     * This method can disincline the Player to change his/her speed for a few seconds.
     */
    public void Modify(Player p) {
        System.out.println("Modify method from Oil class");
        p.LockSpeed();
    }


}