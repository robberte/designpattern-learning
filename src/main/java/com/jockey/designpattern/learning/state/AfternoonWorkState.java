package com.jockey.designpattern.learning.state;

/**
 * @author robberte
 * @date 2018/11/10 下午11:42
 */
public class AfternoonWorkState implements WorkState {


    @Override
    public void writeProgram(Work work) {

        if(work.getHour() < 17) {
            System.out.println(String.format("当前时间：%sd点，下午状态不错，继续努力", work.getHour()));
        } else {
            work.setWorkState(new EveningWorkState());
            work.writeProgram();
        }
    }
}
