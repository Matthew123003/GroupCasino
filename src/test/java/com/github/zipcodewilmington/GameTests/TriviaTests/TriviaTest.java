package com.github.zipcodewilmington.GameTests.TriviaTests;

import com.github.zipcodewilmington.casino.games.Trivia.TriviaGame;
import org.junit.Assert;
import org.junit.Test;

public class TriviaTest {
    @Test
    public void testGetRules() {
        TriviaGame triviaGame = new TriviaGame();
        String expectedRules = "Welcome to Random Trivia try your luck to see if you can get them all right! ";

        String actualRules = triviaGame.getRules();

        Assert.assertEquals(expectedRules,actualRules);
    }

}
