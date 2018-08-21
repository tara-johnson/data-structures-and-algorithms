package day31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepeatedWordTest {

    @Test
    void emptyStringTest() {
        String story = "";

        String expected = "";
        String result = RepeatedWord.repeatedWord(story);

        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);

        assertEquals(expected, result);
    }

    @Test
    void singleWordStringTest() {
        String story = "Single";

        String expected = "";
        String result = RepeatedWord.repeatedWord(story);

        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);

        assertEquals(expected, result);
    }

    @Test
    void onceUponStringTest() {
        String story = "Once upon a time, there was a brave princess who...";

        String expected = "a";
        String result = RepeatedWord.repeatedWord(story);

        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);

        assertEquals(expected, result);
    }

    @Test
    void noRepeatsStringTest() {
        String story = "Once upon a time, there was brave princess who...";

        String expected = "";
        String result = RepeatedWord.repeatedWord(story);

        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);

        assertEquals(expected, result);
    }

    @Test
    void bestOfTimesTest() {
        String story = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";

        String expected = "it";
        String result = RepeatedWord.repeatedWord(story);

        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);

        assertEquals(expected, result);
    }

    @Test
    void summerTest() {
        String story = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";

        String expected = "summer";
        String result = RepeatedWord.repeatedWord(story);

        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);

        assertEquals(expected, result);
    }

    @Test
    void stringWithNumbersTest() {
        String story = "I am 15 years and 3 months and 2 days.";

        String expected = "and";
        String result = RepeatedWord.repeatedWord(story);

        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);

        assertEquals(expected, result);
    }

    @Test
    void onlyNumbersTest() {
        String story = "1 2 3, 4 5 6 7, 8 9 10 11 12... 237";

        String expected = "";
        String result = RepeatedWord.repeatedWord(story);

        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);

        assertEquals(expected, result);
    }
}