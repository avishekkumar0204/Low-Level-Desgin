package StrategyEx2;

public class GoogleMap {
    public static void findPath(String from, String to, TravelMode mode) {
        if(mode.equals(TravelMode.BIKE)) {
            System.out.println("Algorithm to find best path by bike");
        }
        else if(mode.equals(TravelMode.CAR)) {
            System.out.println("Algorithm to find best path by car");
        }
        else if(mode.equals(TravelMode.WALK)) {
            System.out.println("Algorithm to find best path by walk");
        }
    }
}
