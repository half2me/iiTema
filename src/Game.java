import Model.Map;
import Model.Player;
import com.sun.tools.javac.jvm.Gen;
import java.io.*;

import java.util.ArrayList;

/**
 * This class is responsible for the most important components of the game.
 */
public class Game {

    private Map map;
    private ArrayList<Player> players;

    /**
     * That is a constructor for the Game class.
     */
    public Game() {
        this.players = new ArrayList<Player>(1);
        System.out.println("<<create>> game");
    }


    /**
     *This method generates a Map which contains game elements randomly.
     */
    public void GenerateRandomMap() {
        System.out.println("GenerateRandomMap method from Game class");
        map = new Map(3);
    }


    /**
     * @param name
     * Use this if you want to create a new Player and this will place the Player to the start line.
     */
    public void CreatePlayer(String name) {
        System.out.println("CreatePlayer method from Game class");
        Player player1 = new Player(name);
        players.add(player1);
        this.map.AddElement(0, player1);
    }


    /**
     * Users can start a new game calling this method.
     */
    public void NewGame() {
        System.out.println("NewGame method from Game class");
        GenerateRandomMap();
        CreatePlayer("player1");
    }


    /**
     * This method is called when a game has finished.
     */
    public void Exit() {
        System.out.println("Exit method from Game class");
        // TODO implement here
    }


    /**
     * Move the game along by a cycle.
     * Move the player by their speed etc.
     */
    public void tick()
    {
	System.out.println("tick method from Game class");
    }


    /**
     * @param args
     */
    public static boolean beolvas(String g,char I,char N,int eddig/*,char O = 'I'*/)throws IOException{
        boolean igaz= false;
        char c; int a;
        int i = (int)I;
        int n = (int)N;
        //int o = (int)O;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int K=0;K<eddig;K++)System.out.print("  ");
        System.out.println(g);
        do { for(int K=0;K<eddig;K++)System.out.print("  "); c = (char) br.read();}
        while(c != I && c != N /*&& c != O*/); a = (int)c;
        if(a == i)igaz=true;
        return igaz;
    }

    public static void sorbair(String g,int eddig)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int K=0;K<eddig;K++)System.out.print("  ");
        System.out.println(g);
    }

    public static void main(String[] args) throws IOException{
        int i=0;
        do{
        if(beolvas("Uj jatekot szeretne inditani? (I/N)",'I','N',i++)){
            if(beolvas("Olaly foltot szeretne letenni? (I/N)",'I','N',i++)){
                if(beolvas("Eppen ugrik? (I/N)",'I','N',i++)){
                    if(beolvas("A csapda utkozne mas csapdaval ? (I/N)",'I','N',i++)){

                        sorbair("a csapda elhelyezese nem tortenik meg", i);
                    }else{
                        sorbair("a csapda elhelyezese",i);

                    }
                }else sorbair("a csapda elhelyezese nem tortenik meg",i);

            }else if(beolvas("Ragacsot szeretne letenni? (I/N)",'I','N',i++)){
                if(beolvas(" Eppen ugrik? (I/N)",'I','N',i++)){
                    if(beolvas(" A csapda utkozne mas csakpdaval ? (I/N)",'I','N',i++)){

                        sorbair("a csapda elhelyezese nem tortenik meg",i);
                    }else sorbair("a csapda elhelyezese",i);
                }else sorbair("a csapda elhelyezese nem tortenik meg",i);
            }else sorbair("tovabb lepes",i);
            i=1;
            if(beolvas("Akadaly kovetkezik: Atugorja? (I/N)",'N','I',i++)){
                if(beolvas("Milyen akadaly kovetkezik Szakadek ? (I/N)",'N','I',i++)){
                    if(beolvas("Milyen akadaly kovetkezik  Ragacs vagy Olaj folt? ? (R/O)",'R','O',i++)){

                        sorbair("Az on sebessege fokozott mertekben lecsokkent",i);
                    }else sorbair("Most kis idore nem tudja megvaltoztani a sebesseget.",i);
                }else sorbair("On sajnos kiesett a jatekbol.",i);
            }i=1;
            if(beolvas("Kivanja modositani a sebesseget? (I/N)",'I','N',i++)) {
                if (beolvas("Olajtocsa hatasa alatt van? (I/N)", 'N', 'I', i++)) {
                    if (beolvas("Gyorsitani vagy Lassitani akar? (G/L))", 'G', 'L', i++)) {

                        sorbair("Az on sebessege megnovekedett",i);
                    } else sorbair("Az on sebessege csokent",i);
                }
            }i=1;

            String nyertes = "nyert";
            System.out.print("vege a jateknak a nyertes: "); System.out.println(nyertes);
        }i=0;

        }while(beolvas("Kivanja ujra kezdeni (I/N)",'I','N',i=0)==true);

    }

}