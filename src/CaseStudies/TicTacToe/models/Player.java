package CaseStudies.TicTacToe.models;
import java.util.Scanner;

public class Player {
    private int id;
    private String name;
    private Symbol symbol;
    private PlayerType playerType;
    Scanner scanner;

    public Player(int id, String name, Symbol symbol, PlayerType playerType) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.playerType = playerType;
        scanner = new Scanner(System.in);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public Move makeMove(Board board) {
        int row, col;
        System.out.println("Please enter row and col respectively::");
        row = scanner.nextInt();
        col = scanner.nextInt();
        return new Move(new Cell(row, col), this);
    }
}

