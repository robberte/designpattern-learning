package com.jockey.designpattern.learning.observer;

/**
 * @author robberte
 * @date 2018/11/16 下午10:46
 */
public class ConcreteObserver implements  Observer {

    private String name;

    private String observerState;

    private ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject, String name) {
        this.subject = subject;
        this.name = name;
    }


    @Override
    public void update() {
        this.observerState = subject.getSubjectState();
        System.out.println(String.format("observer(%s) the latest status: %s", name, observerState));
    }

    public ConcreteSubject getSubject() {
        return subject;
    }

    public void setSubject(ConcreteSubject subject) {
        this.subject = subject;
    }
}
