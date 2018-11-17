package com.jockey.designpattern.learning.state;

/**
 * @author robberte
 * @date 2018/11/10 下午11:38
 */
public class NoonWorkState implements WorkState {

    @Override
    public void writeProgram(Work work) {
        if(work.getHour() < 13) {
            System.out.println(String.format("当前时间：%d点，午饭：犯困，午休", work.getHour()));
        } else {
            work.setWorkState(new AfternoonWorkState());
            work.writeProgram();
        }
    }
}
