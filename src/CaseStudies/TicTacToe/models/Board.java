package CaseStudies.TicTacToe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    int size;
    List<List<Cell>> grid;

    Board(int dimension){
        this.size = dimension;
        this.grid = new ArrayList<>();
        for(int i = 0; i < dimension; i++){
            this.grid.add(new ArrayList<>());
            for(int j = 0; j < dimension; j++){
                this.grid.get(i).add(new Cell(i, j));
            }
        }
    }

    public int getSize(){
        return size;
    }
    public void setSize(int size){
        this.size = size;
    }
    public List<List<Cell>> getGrid(){
        return grid;
    }
    public void setGrid(List<List<Cell>> grid){
        this.grid = grid;
    }

    public void display(){
        List<List<Cell>> grid = this.getGrid();
        for(int i = 0; i < grid.size(); i++){
            for(int j = 0; j < grid.get(i).size(); j++){
                Cell c = grid.get(i).get(j);
                c.display();
            }
            System.out.println();
        }
    }
}
