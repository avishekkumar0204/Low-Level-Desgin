package CaseStudies.TicTacToe.models;

import CaseStudies.TicTacToe.strategies.WinningStrategy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GameBuilder {
    int dimension;
    List<Player> players;
    List<WinningStrategy> winningStrategies;

    public GameBuilder setDimension(int dimension) {
        this.dimension = dimension;
        return this;
    }

    public GameBuilder setPlayers(List<Player> players) {
        this.players = players;
        return this;
    }

    public GameBuilder setWinningStrategy(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
        return this;
    }

    void validateBotCount(){
        int botCount = 0;
        for(Player player : players) {
            if(player.getPlayerType() == PlayerType.BOT)
                botCount++;
        }
        if(botCount > 1)
            throw new RuntimeException("Too many Bots!");
    }

    void validateSymbols(){
        Set<Symbol> symbols = new HashSet<>();
        for(Player player : players) {
            symbols.add(player.getSymbol());
        }
        if(symbols.size() != players.size())
            throw new RuntimeException("Two or more people have selected same symbol!!");
    }

    void validatePlayerCount(){
        if(dimension - 1 != players.size()) {
            throw new RuntimeException("Number of players are invalid!");
        }
    }

    void validate() {
        validateBotCount();
        validateSymbols();
        validatePlayerCount();
    }

    public Game build() {
        validate();
        return new Game(this.dimension, this.players, this.winningStrategies);
    }
}
