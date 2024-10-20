package CaseStudies.TicTacToe.strategies;


import CaseStudies.TicTacToe.models.Board;
import CaseStudies.TicTacToe.models.Cell;
import CaseStudies.TicTacToe.models.Move;
import CaseStudies.TicTacToe.models.Player;

import java.util.List;

public class ColumnWinningStrategy implements WinningStrategy {
    public boolean checkWinner(Move move, Board board) {
        int currCol = move.getCell().getCol();
        char currSym = move.getPlayer().getSymbol().getSym();
        boolean sameSym = true;
        List<List<Cell>> grid = board.getGrid();
        for(int row = 0; row < board.getSize(); row++) {
            Cell cell = grid.get(row).get(currCol);
            char cellSym = '_';
            if(cell.getSymbol() != null)
                cellSym = cell.getSymbol().getSym();
            sameSym = sameSym && cellSym == currSym;
        }
        return sameSym;
    }
}
