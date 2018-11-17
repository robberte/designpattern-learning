package com.jockey.designpattern.learning.state;

/**
 * @author robberte
 * @date 2018/11/10 下午11:18
 */
public class ConcreteStateC implements State {

    @Override
    public void handle(Context context) {
        System.out.println("Current state is: C");
        System.out.println("Finished the switch.");
    }
}
