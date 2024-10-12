package CaseStudies.SnakeAndLadder;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        players.add(new Player(Color.BLUE));
        players.add(new Player(Color.RED));
        players.add(new Player(Color.GREEN));
        Game game = new Game(players);

        while(game.makeMove() == false){

        }
    }
}
