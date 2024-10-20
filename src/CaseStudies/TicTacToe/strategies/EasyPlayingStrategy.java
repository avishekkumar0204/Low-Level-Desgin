package CaseStudies.TicTacToe.strategies;

import CaseStudies.TicTacToe.models.*;

import java.util.List;

public class EasyPlayingStrategy implements BotPlayingStrategy{
    public Move makeMove(Board board, Player player){
        List<List<Cell>> grid = board.getGrid();
        for(List<Cell> row : grid){
            for(Cell cell : row){
                if(cell.getCellState() == CellState.EMPTY)
                    return new Move(cell, player);
            }
        }
        return null;
    }
}
