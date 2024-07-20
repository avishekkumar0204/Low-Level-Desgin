package StrategyDesginPattern;

public class Client {
    public static void main(String[] args) {
        GoogleMap g = new GoogleMap();
        g.findPath(TravelMode.BIKE);
    }
}
