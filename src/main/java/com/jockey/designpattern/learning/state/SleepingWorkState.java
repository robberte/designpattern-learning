package com.jockey.designpattern.learning.state;

/**
 * @author robberte
 * @date 2018/11/10 下午11:50
 */
public class SleepingWorkState implements WorkState {
    @Override
    public void writeProgram(Work work) {
        System.out.println(String.format("当前时间：%d点，不行了，睡着了", work.getHour()));
    }
}
