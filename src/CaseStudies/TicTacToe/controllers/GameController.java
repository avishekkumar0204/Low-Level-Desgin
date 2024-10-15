package CaseStudies.TicTacToe.controllers;

import CaseStudies.TicTacToe.models.*;
import CaseStudies.TicTacToe.strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class GameController {

    public Game startGame(int dimension,
                          List<Player> players,
                          List<WinningStrategy> winningStrategies
    ){
        /*
            Validations to add
            1. no of players = n - 1
            2. Every player should have different symbol
            3. There should be only one bot in the game

            All this validation we can add here only before creating object of Game. But lets
            revise builder design pattern.
         */
        Game game = Game.getBuilder().
                setDimension(3).
                setPlayers(new ArrayList<>()).
                setWinningStrategy(new ArrayList<>())
                .build();
        return game;
    }

    public void displayBoard(Game game){
        List<List<Cell>> grid = game.getBoard().getGrid();
        for(int i = 0; i < grid.size(); i++){
            for(int j = 0; j < grid.get(i).size(); j++){
                Cell.printCellSymbol(grid.get(i).get(j));
            }
            System.out.println();
        }

    }

    public void makeMove(Game game){

    }

    public GameState checkState(Game game){
        return null;
    }

    public void undo(Game game){

    }

    public Player getWinner(Game game){
        return null;
    }
}
