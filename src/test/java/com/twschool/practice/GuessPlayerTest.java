package com.twschool.practice;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GuessPlayerTest {
    @Test
    public void should_return_score_3_when_win_once() {
        Player player = new Player();
        GuessNumber guessNumber = new GuessNumber();
        List<Integer> asList = Arrays.asList(1, 2, 3, 4);
        List<Integer> askList1 = Arrays.asList(1, 2, 3, 4);
        assertEquals("连赢1次!目前分数是：3", player.play(asList, askList1));
    }
    @Test
    public void should_return_score_6_when_win_serial_2() {
        Player player = new Player();
        GuessNumber guessNumber = new GuessNumber();
        List<Integer> asList = Arrays.asList(1, 2, 3, 4);
        List<Integer> askList1 = Arrays.asList(1, 2, 3, 4);
        for (int i = 0; i < 1; i++) {
            player.play(asList, askList1);
        }
        assertEquals("连赢2次!目前分数是：6", player.play(asList, askList1));
    }
    @Test
    public void should_return_score_minus_3_when_wrong_once() {
        Player player = new Player();
        GuessNumber guessNumber = new GuessNumber();
        List<Integer> asList = Arrays.asList(1, 2, 3, 4);
        List<Integer> askList2 = Arrays.asList(1, 2, 3, 5);
        assertEquals("猜错了！连赢中断！目前分数是：-3", player.play(asList, askList2));
    }

    @Test
    public void should_return_score_minus_9_when_wrong_serial_3() {
        Player player = new Player();
        GuessNumber guessNumber = new GuessNumber();
        List<Integer> asList = Arrays.asList(1, 2, 3, 4);
        List<Integer> askList2 = Arrays.asList(1, 2, 3, 5);
        for (int i = 0; i < 2; i++) {
            player.play(asList, askList2);
        }
        assertEquals("猜错了！连赢中断！目前分数是：-9", player.play(asList, askList2));
    }

    @Test
    public void should_return_score_11_when_win_serial_3() {
        Player player = new Player();
        GuessNumber guessNumber = new GuessNumber();
        List<Integer> asList = Arrays.asList(1, 2, 3, 4);
        List<Integer> askList1 = Arrays.asList(1, 2, 3, 4);
        for (int i = 0; i < 2; i++) {
            player.play(asList, askList1);
        }
        assertEquals("连赢3次!目前分数是：11", player.play(asList, askList1));
    }
    @Test
    public void should_return_score_14_when_win_serial_4() {
        Player player = new Player();
        GuessNumber guessNumber = new GuessNumber();
        List<Integer> asList = Arrays.asList(1, 2, 3, 4);
        List<Integer> askList1 = Arrays.asList(1, 2, 3, 4);
        for (int i = 0; i < 3; i++) {
            player.play(asList, askList1);
        }
        assertEquals("连赢4次!目前分数是：14", player.play(asList, askList1));
    }
    @Test
    public void should_return_score_20_when_win_serial_5() {
        Player player = new Player();
        GuessNumber guessNumber = new GuessNumber();
        List<Integer> asList = Arrays.asList(1, 2, 3, 4);
        List<Integer> askList1 = Arrays.asList(1, 2, 3, 4);
        for (int i = 0; i < 4; i++) {
            player.play(asList, askList1);
        }
        assertEquals("连赢5次!目前分数是：20", player.play(asList, askList1));
    }
    @Test
    public void should_return_score_25_when_win_serial_6() {
        Player player = new Player();
        GuessNumber guessNumber = new GuessNumber();
        List<Integer> asList = Arrays.asList(1, 2, 3, 4);
        List<Integer> askList1 = Arrays.asList(1, 2, 3, 4);
        for (int i = 0; i < 5; i++) {
            player.play(asList, askList1);
        }
        assertEquals("连赢6次!目前分数是：25", player.play(asList, askList1));
    }
    @Test
    public void should_return_score_42_when_win_serial_10() {
        Player player = new Player();
        GuessNumber guessNumber = new GuessNumber();
        List<Integer> asList = Arrays.asList(1, 2, 3, 4);
        List<Integer> askList1 = Arrays.asList(1, 2, 3, 4);
        for (int i = 0; i < 9; i++) {
            player.play(asList, askList1);
        }
        assertEquals("连赢10次!目前分数是：42", player.play(asList, askList1));
    }
    @Test
    public void should_return_score_39_when_win_serial_10_and_wrong_once() {
        Player player = new Player();
        GuessNumber guessNumber = new GuessNumber();
        List<Integer> asList = Arrays.asList(1, 2, 3, 4);
        List<Integer> askList1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> askList2 = Arrays.asList(1, 6, 3, 4);
        for (int i = 0; i < 10; i++) {
            player.play(asList, askList1);
        }
        assertEquals("猜错了！连赢中断！目前分数是：39", player.play(asList, askList2));
    }
    @Test
    public void should_return_score_28_when_win_serial_5_and_wrong_once_and_win_serial_3() {
        Player player = new Player();
        GuessNumber guessNumber = new GuessNumber();
        List<Integer> asList = Arrays.asList(1, 2, 3, 4);
        List<Integer> askList1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> askList2 = Arrays.asList(1, 6, 3, 4);
        for (int i = 0; i < 5; i++) {
            player.play(asList, askList1);
        }
        player.play(asList, askList2);
        for (int i = 0; i < 2; i++) {
            player.play(asList, askList1);
        }
        assertEquals("连赢3次!目前分数是：28", player.play(asList, askList1));
    }
}