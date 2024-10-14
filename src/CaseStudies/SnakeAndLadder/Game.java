package CaseStudies.SnakeAndLadder;

import java.util.List;
import java.util.Map;

public class Game {
    private static Board board;
    private static Dice dice;
    private static List<Player> players;
    private static int currPlayerIdx;

    Game(List<Player> players){
        Board.initialiseBoard();
        this.dice = new Dice();
        this.players = players;
        currPlayerIdx = 0;
    }

    public boolean makeMove(){
        Player currPlayer = getCurrentPlayer();
        int num = dice.rollDice();
        System.out.println(currPlayer.getChoosenColor() + " is Playing!! & got " + num);
        int cell = currPlayer.playerCurrentPosition + num;
        if(cell <= 100) {
            cell = Board.haveSnake(cell);
            cell = Board.haveLadder(cell);
        }
        else{
            cell = cell - num;
        }
        currPlayer.playerCurrentPosition = cell;
        if(cell == 100) {
            System.out.println("Hurray, " + currPlayer.getChoosenColor() + " You have won the match");
            return true;
        }
        getGameCurrentStatus();
        if(num != 6)
            currPlayerIdx = (currPlayerIdx + 1) % players.size();
        return false;
    }

    public Board getBoard(){
        return this.board;
    }

    public static Player getCurrentPlayer(){
        return players.get(currPlayerIdx);
    }

    public static void getGameCurrentStatus(){
        System.out.println("Current status of game is: ");
        for(Player p : players){
            System.out.println(p.getChoosenColor() + " " + p.playerCurrentPosition);
        }

        System.out.println();
    }
}
