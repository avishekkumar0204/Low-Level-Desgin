package CaseStudies.TicTacToe.strategies;


import CaseStudies.TicTacToe.models.Board;
import CaseStudies.TicTacToe.models.Move;
import CaseStudies.TicTacToe.models.Player;

public interface WinningStrategy {
    public boolean checkWinner(Move move, Board board);
}
