package CaseStudies.SnakeAndLadder;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private static int[][] grid = new int[10][10];
    private static List<Snake> snakes = new ArrayList<>();
    private static List<Ladder> ladders = new ArrayList<>();

    public static void initialiseBoardWithNumbers(){
        int num = 1;
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++)
                grid[i][j] = num++;
        }
    }

    public static void addSnakes(){
        snakes.add(new Snake(87, 12));
        snakes.add(new Snake(43, 28));
        snakes.add(new Snake(73, 52));
        snakes.add(new Snake(23, 5));
    }

    public static List<Snake> getSnakes(){
        return snakes;
    }

    public static void addLadders(){
        ladders.add(new Ladder(5, 40));
        ladders.add(new Ladder(45, 60));
        ladders.add(new Ladder(24, 78));
    }

    public static List<Ladder> getLadders(){
        return ladders;
    }

    public static int haveSnake(int pos){
        int newPos = pos;
        for(Snake s : snakes){
            int startPoint = s.getStartPoint();
            if(startPoint == pos){
                System.out.println("Oh Noo, It has snake!!!");
                newPos = s.getEndPoint();
                break;
            }
        }
        return newPos;
    }

    public static int haveLadder(int pos){
        int newPos = pos;
        for(Ladder l : ladders){
            int startPoint = l.getStartPoint();
            if(startPoint == pos){
                System.out.println("Oh yes, It has ladder!!!");
                newPos = l.getEndPoint();
                break;
            }
        }
        return newPos;
    }

    public static void initialiseBoard(){
        initialiseBoardWithNumbers();
        addSnakes();
        addLadders();
    }

    public static void printBoard(){
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
