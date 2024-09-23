package StrategyEx2;

public class GoogleMap {
    public static Exception findPath(String from, String to, TravelMode mode) {
        PathCalculator pc = PathCalculatorFactory.getPathCalculator(mode);
        if(pc == null) {
            return new Exception("Mode of travel doesn't exist");
        }
        pc.findPath(to, from);
        return null;
    };
}
