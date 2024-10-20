package CaseStudies.TicTacToe;

import CaseStudies.TicTacToe.controllers.GameController;
import CaseStudies.TicTacToe.models.*;
import CaseStudies.TicTacToe.strategies.ColumnWinningStrategy;
import CaseStudies.TicTacToe.strategies.EasyPlayingStrategy;
import CaseStudies.TicTacToe.strategies.RowWinningStrategy;
import CaseStudies.TicTacToe.strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        GameController gameController = new GameController();
        System.out.println("Game is Starting!");

        try{
            int dimension = 3;
            List<Player> players = new ArrayList<>();
            players.add(new Player(1, "Avishek", new Symbol('X'), PlayerType.HUMAN));
            players.add(new Bot(2, "7YtE0", new Symbol('0'), PlayerType.HUMAN, BotDifficultyLevel.EASY));

            List<WinningStrategy> winningStrategies = new ArrayList<>();
            winningStrategies.add(new RowWinningStrategy());
            winningStrategies.add(new ColumnWinningStrategy());

            Game game = gameController.startGame(dimension, players, winningStrategies);

            while(gameController.checkState(game) == GameState.IN_PROGRESS) {
                gameController.displayBoard(game);
                gameController.makeMove(game);

                System.out.println();
            }

            gameController.displayBoard(game);
            if(gameController.checkState(game) == GameState.DRAW) {
                System.out.println("The game ends in DRAW!!");
            } else if(gameController.checkState(game) == GameState.SUCCESS){
                System.out.println("The winner is " + gameController.getWinner(game));
            }
        }catch(Exception e){
            System.out.println("Error message is: " + e.getMessage());
            System.out.println("Something went wrong!");
        }

    }
}
