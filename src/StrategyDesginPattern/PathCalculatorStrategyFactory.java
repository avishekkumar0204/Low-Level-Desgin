package StrategyDesginPattern;

public class PathCalculatorStrategyFactory {
    static PathCalculatorStrategy findPathCalculatorStrategyByMode(TravelMode travelMode){
        PathCalculatorStrategy pathCalculatorStrategy = null;
        if(travelMode.equals(TravelMode.BIKE)){
            pathCalculatorStrategy = new BikePathCalculatorStrategy();
        }
        else if(travelMode.equals(TravelMode.CAR)){
            pathCalculatorStrategy = new CarPathCalculatorStrategy();
        }
        else if(travelMode.equals(TravelMode.TRAIN)){
            pathCalculatorStrategy = new TrainPathCalculatorStrategy();
        }
        return pathCalculatorStrategy;
    }
}
