package com.jockey.designpattern.learning.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author robberte
 * @date 2018/11/11 下午11:30
 */
public abstract class Subject {

    private List<Observer> observerList = new ArrayList<Observer>();

    public void attach(Observer observer) {
        observerList.add(observer);
    }

    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObserver() {
        observerList.stream().forEach(
                observer -> observer.update()
        );
    }

}
