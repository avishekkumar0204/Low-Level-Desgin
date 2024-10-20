package CaseStudies.TicTacToe.models;

import CaseStudies.TicTacToe.strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    Board board;
    List<Player> players;
    List<Move> moves;
    Player winner;
    int nextPlayerIdx;
    GameState gameState;
    List<WinningStrategy> winningStrategies;

    public Game(int dimension, List<Player> players, List<WinningStrategy> winningStrategies) {
        this.board = new Board(dimension);
        this.players = players;
        this.winningStrategies = winningStrategies;
        this.moves = new ArrayList<>();
        this.winner = null;
        this.nextPlayerIdx = 0;
        this.gameState = GameState.IN_PROGRESS;
    }

    public Board getBoard() {
        return board;
    }
    public void setBoard(Board board) {
        this.board = board;
    }
    public List<Player> getPlayers() {
        return players;
    }
    public void setPlayers(List<Player> players) {
        this.players = players;
    }
    public List<Move> getMoves() {
        return moves;
    }
    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }
    public Player getWinner() {
        return winner;
    }
    public void setWinner(Player winner) {
        this.winner = winner;
    }
    public int getNextPlayerIdx() {
        return nextPlayerIdx;
    }
    public void setNextPlayerIdx(int nextPlayerIdx) {
        this.nextPlayerIdx = nextPlayerIdx;
    }
    public GameState getGameState() {
        return gameState;
    }
    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }
    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }
    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public static GameBuilder getBuilder(){
        return new GameBuilder();
    }

    public boolean validateMove(Move move){
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        if(row < 0 || row >= board.getSize() || col < 0 || col >= board.getSize()){
            return false;
        }
        if(!board.getGrid().get(row).get(col).getCellState().equals(CellState.EMPTY)){
            return false;
        }
        return true;
    }
    public void makeMove(){
        Player currentPlayer = players.get(nextPlayerIdx);
        System.out.println(currentPlayer.getName() + " is playing!!");
        Move move = currentPlayer.makeMove(board);
        boolean validMove = validateMove(move);
        if(!validMove){
            System.out.println(currentPlayer.getName() + " not a valid move, Please try again");
            return;
        }

        // Update the board
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        Cell cellToChnage = board.getGrid().get(row).get(col);
        cellToChnage.setCellState(CellState.FILLED);
        cellToChnage.setSymbol(currentPlayer.getSymbol());

        moves.add(new Move(cellToChnage, currentPlayer));

        // Check if current player is winner or not
        if(checkWinner(board, move)){
            winner = currentPlayer;
            gameState = gameState.SUCCESS;
        }
        else if(moves.size() == board.getSize() * board.getSize()){
            gameState = gameState.DRAW;
        }

        nextPlayerIdx = (nextPlayerIdx + 1) % players.size();

    }

    public boolean checkWinner(Board board, Move move){
        boolean winnerFound = false;
        for(WinningStrategy winningStrategy : winningStrategies){
            winnerFound = winnerFound || winningStrategy.checkWinner(move, board);
            if(winnerFound)
                return true;
        }
        return false;
    }

}
