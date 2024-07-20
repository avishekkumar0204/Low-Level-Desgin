package StrategyDesginPattern;

public class GoogleMap {
    void findPath(TravelMode travelMode){
        PathCalculatorStrategy pathCalculatorStrategy = PathCalculatorStrategyFactory.findPathCalculatorStrategyByMode(travelMode);
        pathCalculatorStrategy.findPath();
    }
}
