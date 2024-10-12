package CaseStudies.SnakeAndLadder;

public class Player {
    private Color choosenColor;
    int playerCurrentPosition;

    Player(Color choosenColor) {
        this.choosenColor = choosenColor;
        this.playerCurrentPosition = 1;
    }

    Color getChoosenColor() {
        return choosenColor;
    }
}
