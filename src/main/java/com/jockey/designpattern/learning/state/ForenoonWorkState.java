package com.jockey.designpattern.learning.state;

/**
 * @author robberte
 * @date 2018/11/10 下午11:35
 */
public class ForenoonWorkState implements WorkState {

    @Override
    public void writeProgram(Work work) {
        if(work.getHour() < 12) {
            System.out.println(String.format("当前时间：%d点，上午工作，精神百倍", work.getHour()));
        } else {
            work.setWorkState(new NoonWorkState());
            work.writeProgram();
        }

    }
}
