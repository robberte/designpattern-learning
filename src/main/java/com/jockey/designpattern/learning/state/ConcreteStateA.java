package com.jockey.designpattern.learning.state;

/**
 * @author robberte
 * @date 2018/11/10 下午11:13
 */
public class ConcreteStateA implements State {

    @Override
    public void handle(Context context) {

        System.out.println("Current state is: A");

        context.setCurrentState(new ConcreteStateB());

    }
}
