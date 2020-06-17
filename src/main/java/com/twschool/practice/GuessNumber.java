package com.twschool.practice;

import java.util.*;

public class GuessNumber {
    List<Integer> answer = new ArrayList<Integer>();
    List<Integer> ask = new ArrayList<Integer>();

    public List<Integer> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Integer> answer) {
        this.answer = answer;
    }

    public List<Integer> getAsk() {
        return ask;
    }

    public void setAsk(List<Integer> ask) {
        this.ask = ask;
    }

    public String Answer(List<Integer> answer, List<Integer> ask) {
        int answerA = 0, answerB = 0;
        for (int i = 0; i < answer.size(); i++) {
            if (answer.get(i) == ask.get(i)) {
                answerA++;
            } else if (answer.contains(ask.get(i))) {
                answerB++;
            }
//            if (answerA == 4) {
//                return answerA + "A" + answerB + "B" + " Win!";
//            }
        }
        return answerA + "A" + answerB + "B";
    }

    public boolean Generator(List<Integer> answer, List<Integer> ask) {
        if (ask.size() != answer.size()) {
            return false;
        }
        HashSet<Integer> set = new HashSet<Integer>(ask);
        if (set.size() != ask.size()) {
            return false;
        }
        return true;
    }

    public String Game(List<Integer> gameanswer, List<Integer> gameask) {
        if (Generator(gameanswer, gameask)) {
            return Answer(gameanswer, gameask);
        } else {
            return "Wrong input,input again!";
        }
    }
}