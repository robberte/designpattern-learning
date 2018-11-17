package com.jockey.designpattern.learning.observer;

/**
 * @author robberte
 * @date 2018/11/16 下午11:02
 */
public class ObserverDemo {

    public static void main(String[] args) {

        ConcreteSubject subject = new ConcreteSubject();

        subject.attach(new ConcreteObserver(subject, "Jockey"));
        subject.attach(new ConcreteObserver(subject, "Eric"));
        subject.attach(new ConcreteObserver(subject, "Curry"));

        subject.setSubjectState("good");

        subject.notifyObserver();

        subject.setSubjectState("bad");
        subject.notifyObserver();
    }
}
