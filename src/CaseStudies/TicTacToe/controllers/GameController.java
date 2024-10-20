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
                setDimension(dimension).
                setPlayers(players).
                setWinningStrategy(winningStrategies).
                build();
        return game;
    }

    public void displayBoard(Game game){
        game.getBoard().display();
    }

    public void makeMove(Game game){
        game.makeMove();
    }

    public GameState checkState(Game game){
        return game.getGameState();
    }

    public void undo(Game game){

    }

    public String getWinner(Game game){
        return game.getWinner().getName();
    }
}
