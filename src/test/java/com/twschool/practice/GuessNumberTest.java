package com.twschool.practice;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GuessNumberTest {
    @Test
    public void should_return_1A0B_when_input_1_5_6_7() {
        GuessNumber guessNumber = new GuessNumber();
        List<Integer> asList = Arrays.asList(1, 2, 3, 4);
        List<Integer> askList = Arrays.asList(1, 5, 6, 7);
        assertEquals("1A0B", guessNumber.Game(asList,askList));
    }

    @Test
    public void should_return_0A2B_when_input_2_4_7_8() {
        GuessNumber guessNumber = new GuessNumber();
        List<Integer> asList = Arrays.asList(1, 2, 3, 4);
        List<Integer> askList = Arrays.asList(2, 4, 7, 8);
        assertEquals("0A2B", guessNumber.Game(asList,askList));
    }

    @Test
    public void should_return_1A2B_when_input_0_3_2_4() {
        GuessNumber guessNumber = new GuessNumber();
        List<Integer> asList = Arrays.asList(1, 2, 3, 4);
        List<Integer> askList = Arrays.asList(0, 3, 2, 4);
        assertEquals("1A2B", guessNumber.Game(asList,askList));
    }

    @Test
    public void should_return_0A0B_when_input_5_6_7_8() {
        GuessNumber guessNumber = new GuessNumber();
        List<Integer> asList = Arrays.asList(1, 2, 3, 4);
        List<Integer> askList = Arrays.asList(5, 6, 7, 8);
        assertEquals("0A0B", guessNumber.Game(asList,askList));
    }
    @Test
    public void should_return_0A4B_when_input_4_3_2_1() {
        GuessNumber guessNumber = new GuessNumber();
        List<Integer> asList = Arrays.asList(1, 2, 3, 4);
        List<Integer> askList = Arrays.asList(4, 3, 2, 1);
        assertEquals("0A4B", guessNumber.Game(asList,askList));
    }
    @Test
    public void should_return_4A0B_Win_when_input_1_2_3_4() {
        GuessNumber guessNumber = new GuessNumber();
        List<Integer> asList = Arrays.asList(1, 2, 3, 4);
        List<Integer> askList = Arrays.asList(1, 2, 3, 4);
        assertEquals("4A0B Win!", guessNumber.Game(asList,askList));
    }

    @Test
    public void should_return_4A0B_when_input_1_1_2_3() {
        GuessNumber guessNumber = new GuessNumber();
        List<Integer> asList = Arrays.asList(1, 2, 3, 4);
        List<Integer> askList = Arrays.asList(1, 1, 2, 3);
        assertEquals("Wrong input,input again!", guessNumber.Game(asList,askList));
    }

    @Test
    public void should_return_4A0B_when_input_1_2() {
        GuessNumber guessNumber = new GuessNumber();
        List<Integer> asList = Arrays.asList(1, 2, 3, 4);
        List<Integer> askList = Arrays.asList(1, 2);
        assertEquals("Wrong input,input again!", guessNumber.Game(asList,askList));
    }
}
