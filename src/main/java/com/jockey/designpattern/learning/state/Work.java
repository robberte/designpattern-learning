package com.jockey.designpattern.learning.state;

/**
 * @author robberte
 * @date 2018/11/10 下午11:30
 */
public class Work {

    private WorkState workState;

    private int hour = 9;
    private boolean taskFinished = false;

    public Work() {
        hour = 9;
        taskFinished = false;
        workState = new ForenoonWorkState();
    }

    public void writeProgram() {
        workState.writeProgram(this);
    }

    public WorkState getWorkState() {
        return workState;
    }

    public void setWorkState(WorkState workState) {
        this.workState = workState;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public boolean isTaskFinished() {
        return taskFinished;
    }

    public void setTaskFinished(boolean taskFinished) {
        this.taskFinished = taskFinished;
    }


    public static void main(String[] args) {

        Work emergencyProjects = new Work();

        for(int hour = 8; hour < 24; hour++) {
            emergencyProjects.setHour(hour);
            if(emergencyProjects.getHour() > 19) {
                emergencyProjects.setTaskFinished(true);
            }

            emergencyProjects.writeProgram();
        }


    }
}
