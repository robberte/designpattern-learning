package com.jockey.designpattern.learning.state;

/**
 * @author robberte
 * @date 2018/11/10 下午11:48
 */
public class RestWorkState implements WorkState {

    @Override
    public void writeProgram(Work work) {
        System.out.println(String.format("当前时间：%d点，下班回家，好好生活", work.getHour()));
    }
}
