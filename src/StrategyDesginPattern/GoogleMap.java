package StrategyDesginPattern;

public class GoogleMap {
    void findPath(TravelMode travelMode){
        if(travelMode.equals(TravelMode.BIKE)){
            System.out.println("Algorithm to find shortest path for bike");
        }
        else if(travelMode.equals(TravelMode.CAR)){
            System.out.println("Algorithm to find shortest path for car");
        }
        else if(travelMode.equals(TravelMode.TRAIN)){
            System.out.println("Algorithm to find shortest path for train");
        }
    }
}
