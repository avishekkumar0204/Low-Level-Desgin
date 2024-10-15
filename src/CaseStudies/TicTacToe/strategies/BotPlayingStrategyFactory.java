package CaseStudies.TicTacToe.strategies;

import CaseStudies.TicTacToe.models.BotDifficultyLevel;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategyBasedOnDifficulty(BotDifficultyLevel difficulty) {
        BotPlayingStrategy botPlayingStrategy = null;

        if(difficulty == BotDifficultyLevel.EASY)
            botPlayingStrategy = new EasyPlayingStrategy();
        else if(difficulty == BotDifficultyLevel.MEDIUM)
            botPlayingStrategy = new MediumPlayingStrategy();
        else if(difficulty == BotDifficultyLevel.HARD)
            botPlayingStrategy = new HardPlayingStrategy();

        return botPlayingStrategy;
    }
}
