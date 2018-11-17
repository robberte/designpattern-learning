package com.jockey.designpattern.learning.state;

/**
 * @author robberte
 * @date 2018/11/10 下午11:46
 */
public class EveningWorkState implements WorkState {

    @Override
    public void writeProgram(Work work) {
        if(work.isTaskFinished()) {
            work.setWorkState(new RestWorkState());
            work.writeProgram();
            return;
        }

        if(work.getHour() < 21) {
            System.out.println(String.format("当前时间：%d点，加班哦，疲劳工作", work.getHour()));
            return;
        }

        work.setWorkState(new SleepingWorkState());
        work.writeProgram();
    }
}
