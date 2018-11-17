package com.jockey.designpattern.learning.state;

/**
 * @author robberte
 * @date 2018/11/10 下午11:17
 */
public class ConcreteStateB implements State {

    @Override
    public void handle(Context context) {
        System.out.println("Current statu is: B");

        context.setCurrentState(new ConcreteStateC());
    }
}
