package Model;

import java.util.Iterator;

/**
 * Majd ledokumentlja akinek hat anyukja van, és mind egyutcban lakik
 * Magyarul írok, leszarom
 */
public class Robot extends BasicGameElement{
    private int speed;

    public Robot(){
        this.speed = 2;
    }

    public Robot(int speed){
        this.speed = speed;
    }

    public void ModifySpeed(int bps) {
        this.speed = bps;
    }

    public int GetSpeed() {
        return this.speed;
    }

    public void Step(){
        for(Iterator<BasicGameElement> it = this.GetPosition().GetElements().iterator(); it.hasNext();) {
            BasicGameElement bge = it.next();
            if(bge instanceof Oil || bge instanceof Glue) {
                it.remove();
                Bounce();
            }
        }
    }

    public void Bounce(){
        this.speed = (-this.speed);
    }
}
