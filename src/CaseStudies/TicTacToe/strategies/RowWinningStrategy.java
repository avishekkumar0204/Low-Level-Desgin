package CaseStudies.TicTacToe.strategies;


import CaseStudies.TicTacToe.models.Board;
import CaseStudies.TicTacToe.models.Cell;
import CaseStudies.TicTacToe.models.Move;
import CaseStudies.TicTacToe.models.Player;

import java.util.List;

public class RowWinningStrategy implements WinningStrategy{
    public boolean checkWinner(Move move, Board board){
        int currentRow = move.getCell().getRow();
        char currSym = move.getPlayer().getSymbol().getSym();
        boolean sameSym = true;
        List<Cell> row = board.getGrid().get(currentRow);

        for(Cell cell : row){
            char cellSym = '_';
            if(cell.getSymbol() != null)
                cellSym = cell.getSymbol().getSym();
            sameSym = sameSym && cellSym == currSym;
        }

        return sameSym;
    }
}
