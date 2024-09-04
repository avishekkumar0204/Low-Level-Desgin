package StrategyEx2;

public class GoogleMap {
    public static void findPath(String from, String to, TravelMode mode) {
        PathCalculator pc = null;
        if(mode.equals(TravelMode.BIKE)) {
            pc = new BikePathCalculator();
        }
        else if(mode.equals(TravelMode.CAR)) {
            pc = new CarPathCalculator();
        }
        else if(mode.equals(TravelMode.WALK)) {
            pc = new WalkPathCalculator();
        }
        pc.findPath(from, to);
    }
}
