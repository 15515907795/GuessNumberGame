package com.twschool.practice;

import java.util.Arrays;
import java.util.List;

public class Player {
    int score = 0;
    int point = 0;
    GuessNumber guessNumber = new GuessNumber();

    public String play(List<Integer> gameanswer, List<Integer> gameask) {
        String win = "4A0B";
        if (win.equals(guessNumber.Game(gameanswer, gameask))) {
            point++;
            score += 3;
            if (0 == point % 3) {
                score+=2;
            }
            if (0 == point % 5) {
                score+=3;
            }
        } else {
            point = 0;
            score -= 3;
        }
        if (point > 0) {
            return "连赢" + point + "次!" + "目前分数是：" + score;

        } else {
            return "猜错了！连赢中断！" + "目前分数是：" + score;
        }

    }
}

class test {
    public static void main(String[] args) {
        Player player = new Player();
        GuessNumber guessNumber = new GuessNumber();
        List<Integer> asList = Arrays.asList(1, 2, 3, 4);
        List<Integer> askList1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> askList2 = Arrays.asList(1, 6, 3, 4);
        for (int i = 0; i < 6; i++) {
            System.out.println(player.play(asList, askList1));
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(player.play(asList, askList1));
        }
        System.out.println(player.play(asList, askList2));
        for (int i = 0; i < 3; i++) {
            System.out.println(player.play(asList, askList1));
        }

    }
}
