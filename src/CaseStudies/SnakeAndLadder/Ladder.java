package CaseStudies.SnakeAndLadder;

public class Ladder {
    private int startPoint;
    private int endPoint;

    Ladder(int startPoint, int endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    int getStartPoint() {
        return this.startPoint;
    }

    int getEndPoint() {
        return this.endPoint;
    }
}
