package com.jockey.designpattern.learning.observer;

/**
 * @author robberte
 * @date 2018/11/11 下午11:55
 */
public class ConcreteSubject extends Subject {

    private String subjectState;


    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
