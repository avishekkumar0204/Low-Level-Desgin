package CaseStudies.TicTacToe;

import CaseStudies.TicTacToe.controllers.GameController;
import CaseStudies.TicTacToe.models.Game;
import CaseStudies.TicTacToe.models.GameState;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        GameController gameController = new GameController();
        System.out.println("Game is Starting!");

        Game game = gameController.startGame(3, new ArrayList<>(), new ArrayList<>());

        gameController.displayBoard(game);
        while(gameController.checkState(game) == GameState.IN_PROGRESS) {
            gameController.displayBoard(game);
            gameController.makeMove(game);
        }

        if(gameController.checkState(game) == GameState.DRAW) {
            System.out.println("The game ends in DRAW!!");
        } else if(gameController.checkState(game) == GameState.SUCCESS){
            System.out.println("The winner is " + gameController.getWinner(game));
        }
    }
}
