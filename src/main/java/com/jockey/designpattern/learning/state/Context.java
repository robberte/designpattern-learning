package com.jockey.designpattern.learning.state;

/**
 * @author robberte
 * @date 2018/11/10 下午11:11
 */
public class Context {

    private State currentState;

    public Context(State state) {
        this.currentState = state;
    }

    public void request() {
        currentState.handle(this);
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public static void main(String[] args) {
        ConcreteStateA startState = new ConcreteStateA();
        Context context = new Context(startState);
        context.request();
        context.request();
        context.request();
    }
}
