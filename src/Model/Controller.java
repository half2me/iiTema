package Model;

public class Controller {
    private Player player;
    private char left;
    private char right;
    private char jump;
    private char mod1;
    private char mod2;

    public Controller(Player player, char left, char right, char jump, char mod1, char mod2){
        this.player = player;
        this.left = left;
        this.right = right;
        this.jump = jump;
        this.mod1 = mod1;
        this.mod2 = mod2;
    }

    public void Action(char c){
        if(c == left){
            if(player.GetSpeed() < 2) return;
            player.ModifySpeed(player.GetSpeed()-1);
        }
        else if(c == right){
            if(player.GetSpeed() > 2) return;
            player.ModifySpeed(player.GetSpeed()+1);
        }
        else if(c == jump){
            player.Jump();
        }
        else if (c == mod1){
            player.PlaceMod(new Glue());
        }
        else if (c == mod2){
            player.PlaceMod(new Oil());
        }
    }
}
