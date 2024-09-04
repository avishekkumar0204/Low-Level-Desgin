package StrategyEx2;

public class PathCalculatorFactory {
    public static PathCalculator getPathCalculator(TravelMode mode) {
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
        return pc;
    }
}
